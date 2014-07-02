package org.denalo.rshc.rekingdl.graphics;
/**
 * Rekin Game Coordinate
 *			  y ( Rekin.Display.getHeight ( ) / 2 , 0 )
 *            ^
 *            |
 *            |
 *            |(0,0)
 * -----------*----------->x ( Rekin.Display.getWidth ( ) / 2 , 0 )
 *            |
 *            |
 *            | 
 */
import android.graphics.*;
import org.denalo.rshc.rekingdl.system.*;

public class Coord
	{
		private float x , y;
		private int z;

		public Coord ( )
			{
				this.setX ( 0 );
				this.setY ( 0 );
				this.setZ ( 0 );
			}

		public Coord ( float x , float y )
			{
				this.setX ( x );
				this.setY ( y );
				this.setZ ( 0 );
			}

		public Coord ( float x , float y , int z )
			{
				this.setX ( x );
				this.setY ( y );
				this.setZ ( z );
			}

		public Coord ( Coord other )
			{
				this.copy ( other );
			}

		public void setZ ( int z )
			{
				this.z = z;
			}

		public int getZ ( )
			{
				return z;
			}

		public void setX ( float newx )
			{
				this.x = ( Rekin.Display.getWidth ( ) / 2 ) + newx;
			}

		public float getX ( )
			{
				return x;
			}

		public void setY ( float newy )
			{
				this.y = ( Rekin.Display.getHeight ( ) / 2 ) + newy;
			}

		public float getY ( )
			{
				return y;
			}

		public void moveTo ( float x , float y )
			{
				this.setX ( x );
				this.setY ( y );
			}

		public void move ( float addx , float addy )
			{
				this.setX ( this.getX ( ) + addx - Rekin.Display.getWidth ( ) / 2 );
				this.setY ( this.getY ( ) + addy - Rekin.Display.getHeight ( ) / 2 );
			}

		public void copy ( Coord other )
			{
				this.setX ( other.getX ( ) );
				this.setY ( other.getY ( ) );
				this.setZ ( other.getZ ( ) );
			}

		public double distance ( Coord other )
			{
				return Math.sqrt ( Math.pow ( other.getX ( ) - this.getX ( )  , 2 ) + Math.pow ( other.getY ( ) - this.getY ( )  , 2 ) ); 
			}

		public PointF changeToAndroidPoint ( )
			{
				return new PointF ( ( Rekin.Display.getWidth ( ) / 2 ) - this.getX ( ) , ( Rekin.Display.getHeight ( ) / 2 ) - this.getY ( ) );
			}

	}
