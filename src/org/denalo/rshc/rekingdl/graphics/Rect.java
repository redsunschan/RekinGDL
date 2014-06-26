package org.denalo.rshc.rekingdl.graphics;

public class Rect extends Coord
	{

		protected int width , height;

		public Rect ( float x , float y , int width , int height )
			{
				super ( x , y );
				this.setWidth ( width );
				this.setHeight ( height );
			}

		public void setWidth ( int width )
			{
				this.width = width;
			}

		public int getWidth ( )
			{
				return width;
			}

		public void setHeight ( int height )
			{
				this.height = height;
			}

		public int getHeight ( )
			{
				return height;
			}
	}
