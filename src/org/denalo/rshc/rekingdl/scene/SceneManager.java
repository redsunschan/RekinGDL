package org.denalo.rshc.rekingdl.scene;

import org.denalo.rshc.rekingdl.graphics.*;

public class SceneManager
	{
		private static GameScene current;

		private static void setCurrent ( GameScene current )
			{
				SceneManager.current = current;
			}

		public static GameScene getCurrent ( )
			{
				return current;
			}

		public static void call ( GameScene scene )
			{
				SceneManager.setCurrent ( scene );
				RenderSet.initialize ( );
				SceneManager.getCurrent ( ).initialize ( );
			}

	}
