package org.denalo.rshc.rekingdl.graphics;

public class Vertex
	{
		protected float x , y;

		public Vertex ( float x, float y )
			{
				this.x = x;
				this.y = y;
			}


		public void setX ( float x )
			{
				this.x = x;
			}

		public float getX ( )
			{
				return x;
			}

		public void setY ( float y )
			{
				this.y = y;
			}

		public float getY ( )
			{
				return y;
			}

		public double distance ( Vertex v )
			{
				return Math.sqrt ( ( Math.pow ( (double)v.getX ( ) - (double)this.getX ( ), 2 ) + Math.pow ( (double)v.getY ( ) - (double)this.getY ( ), 2 ) ) );
			}
	}
