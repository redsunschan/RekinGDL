package org.denalo.rshc.rekingdl.graphics;

import android.graphics.*;
import android.util.*;
import java.util.*;
import org.denalo.rshc.rekingdl.graphics.*;

public class SpriteSet
	{
		protected static HashMap<Integer , Sprite> list = new HashMap<Integer , Sprite> ( );
		protected static Sprite focusing;

		public static void add ( Sprite sprite )
			{
				sprite.setId ( SpriteSet.list.size ( ) + 1 );
				SpriteSet.list.put ( sprite.getId ( ) , sprite );
			}

		public static void remove ( Sprite sprite )
			{
				if ( SpriteSet.list.containsKey ( sprite.getId ( ) ) )
					{
						SpriteSet.list.remove ( sprite.getId ( ) );
					}
			}

		public static void focusOn ( Sprite sprite )
			{
				SpriteSet.focusing = sprite;
			}

		public static void moveAll ( int x , int y )
			{
				for ( int i = 1; i <= SpriteSet.list.size ( ); i++ )
					{
						if ( SpriteSet.list.containsKey ( i ) )
							{
								Sprite set = SpriteSet.list.get ( i );
								if ( set.getId ( ) != SpriteSet.focusing.getId ( ) )
									{
										set.move ( x , y );
									}
							}
					}
			}

		public static void renderAll ( Canvas canvas )
			{
				for ( int i = 1; i <= SpriteSet.list.size ( ); i++ )
					{
						Log.w ( SpriteSet.class.getSimpleName ( ) , "Getted : " + String.valueOf ( i ) + " Sprite." );
						if ( SpriteSet.list.containsKey ( i ) )
							{
								Sprite set = SpriteSet.list.get ( i );
								canvas.drawBitmap ( set.getBitmap ( ) , set.getX ( ) , set.getY ( ) , set.span );
							}
					}
			}

	}
