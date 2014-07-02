package org.denalo.rshc.rekingdl.graphics;

import android.graphics.*;
import java.util.*;

public class RenderSet
	{
		private static HashMap<Integer , Viewport> viewset;
		private static List<Map.Entry<Integer , Viewport>> list;

		public static void initialize ( )
			{
				RenderSet.viewset = new HashMap<Integer , Viewport> ( );
				list = new ArrayList<Map.Entry<Integer , Viewport>> ( RenderSet.viewset.entrySet ( ) );
			}

		public static void add ( Viewport view )
			{
				RenderSet.viewset.put ( view.getZ ( ) , view );
			}

		public static void render ( Canvas canvas )
			{
				Collections.sort ( list , new Comparator<Map.Entry<Integer , Viewport>> ( ) {
							public int compare ( Map.Entry<Integer, Viewport> o1, Map.Entry<Integer, Viewport> o2 )
								{
									return ( o1.getKey ( ) ).compareTo ( o2.getKey ( ) );
								}
						} );
				for ( HashMap.Entry<Integer , Viewport> entry : viewset.entrySet ( ) )
					{
						entry.getValue ( ).render ( canvas );
					}
			}

	}
