package org.denalo.rshc.rekingdl.graphics;

import android.graphics.*;
import android.util.*;
import java.util.*;

public class Viewport
	{
		private int z;
		private HashMap<Integer , Sprite> spriteset = new HashMap<Integer , Sprite> ( );

		public Viewport ( )
			{
				RenderSet.add ( this );
			}

		public Viewport ( int z )
			{
				this.setZ ( z );
				RenderSet.add ( this );
			}

		public void setZ ( int z )
			{
				this.z = z;
			}

		public int getZ ( )
			{
				return z;
			}

		public void add ( Sprite sprite )
			{
				sprite.setId ( this.spriteset.size ( ) + 1 );
				this.spriteset.put ( sprite.getId ( ) , sprite );
			}

		public void render ( Canvas canvas )
			{
				for ( HashMap.Entry entry : spriteset.entrySet ( ) )
					{
						Sprite s = ( Sprite ) entry.getValue ( );
						canvas.drawBitmap ( s.getTexture ( ).getSrc ( ), s.getX ( ) , s.getY ( ) , s.getSpan ( ) );
						Log.w ( this.getClass ( ).getSimpleName ( ) , "Rendering..." );
					}
			}

		public long count ( )
			{
				return this.spriteset.size ( );
			}

	}
