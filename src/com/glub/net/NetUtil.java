
//*****************************************************************************
//*
//* (c) Copyright 2002. Glub Tech, Incorporated. All Rights Reserved.
//*
//* $Id: NetUtil.java 39 2009-05-11 22:50:09Z gary $
//*
//*****************************************************************************

package com.glub.net;

import java.io.*;
import java.net.*;
import java.security.*;

/***********************************************************************
 * Net utility methods.
 *
 * @ver	1.0
 ***********************************************************************/
public class NetUtil {
  public static String getLocalAddress() {
    String addr = null;

    try {
      InetAddress ia = InetAddress.getLocalHost();

      if (ia != null)
        addr = ia.getHostAddress();
    } catch (UnknownHostException uhe) {
    }

    return addr;
  }

  public static String getHostNameOrAddress( String host ) {
    String hostname = host;

    try {
      InetAddress ia = InetAddress.getByName( host );

      if (ia != null)
        hostname = ia.getHostName();
    } catch (UnknownHostException uhe) {
    }

    return hostname;
  }

// End of class NetUtil
}

