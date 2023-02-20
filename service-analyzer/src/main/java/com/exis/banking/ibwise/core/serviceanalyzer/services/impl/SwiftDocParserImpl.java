package com.exis.banking.ibwise.core.serviceanalyzer.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exis.banking.ibwise.core.serviceanalyzer.services.ISwiftDocumentParser;
import com.prowidesoftware.swift.io.parser.SwiftParser;
import com.prowidesoftware.swift.model.SwiftMessage;
import com.prowidesoftware.swift.model.field.Field32A;
import com.prowidesoftware.swift.model.field.Field50F;
import com.prowidesoftware.swift.model.mt.mt1xx.MT103;
import com.prowidesoftware.swift.utils.Lib;

@Service
public class SwiftDocParserImpl implements ISwiftDocumentParser {

//	private void parse_MT103(String content) {
//		/*
//         * Read and parse the file content into a SWIFT message object
//         * Parse from File could also be used here
//         */
//        MT103 mt = MT103.parse(content);
//
//        /*
//         * Print header information 
//         */
//        //System.out.println("JSON: "+mt.toJson());
//        if (mt.isIncoming()) {
//        	System.out.println("Message incoming (O) ....");
//        }else {
//        	System.out.println("Message outgoing (I) ....");
//        }
//        System.out.println("Message Type: "+mt.getMessageType());
//        
//        System.out.println("Sender: " + mt.getSender());
//        System.out.println("Receiver: " + mt.getReceiver());
//
//       
//        /*
//         * Print details of a specific fields
//         */
//        Field20 ref = mt.getField20();
//        System.out.println(Field.getLabel(ref.getName(), mt.getMessageType(), null) + ": " + ref.getComponent(Field20.REFERENCE));
//
//        Field32A f = mt.getField32A();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
//        System.out.println("Value Date: " + sdf.format(f.getDateAsCalendar().getTime()));
//        System.out.println("Amount: " + f.getCurrency() + " " + f.getAmount());
//	}
	public void parse(String file) throws IOException {
		String content=Lib.readResource("mt103_s1.txt", null);
		SwiftParser swparser=new SwiftParser(content);
		SwiftMessage msg=swparser.message();
		System.out.println("Generic parse.Sender = "+msg.getSender());
		System.out.println("Generic parse.Receiver = "+msg.getReceiver());
		System.out.println("Generic parse.Type = "+msg.getType());
		
		
		if (msg.isType(103)) {
			System.out.println("this is 103 message ....");
			 MT103 mt = MT103.parse(content);
			 Field32A f32a = mt.getField32A();
			 System.out.println("-> 32A ... ");
		        System.out.println(f32a.getAmount());
		        System.out.println(f32a.getDate());
		        System.out.println(f32a.getCurrency());
		     Field50F f50f =mt.getField50F();
		     System.out.println("-> 50F ... ");
		     List<String> list=    f50f.getComponents();
		     Iterator<String> itr=list.iterator();
		     
		     while(itr.hasNext()) {
		    	 System.out.println("==>"+itr.next());
		     }
		     
			if (msg.isIncoming()) {
				System.out.println("Incoming ...");
			}else {
				if (msg.isOutgoing()) {
					System.out.println("outgoing ...");
				}
			}
		}
	}
//	public void parse(String file) throws IOException {
//		String content=Lib.readResource("mt103.txt", null);
//		AbstractMT msg = AbstractMT.parse(content);
//		String sender = msg.getSender();
//		String reciever = msg.getReceiver();
//		 
//		String type = msg.getMessageType();
//		System.out.println("Generic parse.Sender = "+sender);
//		System.out.println("Generic parse.Receiver = "+reciever);
//		System.out.println("Generic parse.Type = "+type);
//		if (msg.isType(103)) {
//			this.parse_MT103(content);
//		}
//        
//	}
	

}
