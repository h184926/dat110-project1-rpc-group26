package no.hvl.dat110.system.display;

import no.hvl.dat110.rpc.RPCServer;
import no.hvl.dat110.system.controller.Common;


public class DisplayDevice {
	
	public static void main(String[] args) {
		
		System.out.println("Display server starting ...");
		
		RPCServer rpcserver = new RPCServer(Common.DISPLAYPORT);
		
		DisplayImpl display = new DisplayImpl((byte)Common.DISPLAY_WRITE_RPCID, rpcserver);
		
		rpcserver.register(Common.DISPLAY_WRITE_RPCID, display);
		
		rpcserver.serve();
		
		System.out.println("Display server stopping ...");
		
	}
}
