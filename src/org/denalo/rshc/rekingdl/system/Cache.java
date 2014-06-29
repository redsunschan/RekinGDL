package org.denalo.rshc.rekingdl.system;

import java.util.*;
import org.denalo.rshc.rekingdl.graphics.*;

public class Cache
	{
		protected static HashMap<Object , Texture> textureMap;

		public static void initialize ( )
			{
				Cache.textureMap = new HashMap<Object , Texture> ( );
			}

		public static Texture loadTexture ( String name )
			{
				if ( ! Cache.textureMap.containsKey ( name ) )
					{
						Cache.textureMap.put ( name , new Texture ( name ) );
					}
				return Cache.textureMap.get ( name );
			}

		public static Texture loadTexture ( int resid )
			{
				if ( ! Cache.textureMap.containsKey ( resid ) )
					{
						Cache.textureMap.put ( resid , new Texture ( resid ) );
					}
				return Cache.textureMap.get ( resid );
			}

	}
