/*
TutorialHelloWorldActivity.java
Copyright (C) 2010  Belledonne Communications, Grenoble, France

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
package org.linphone.core.tutorials;

import org.linphone.R;
import org.linphone.core.AndroidCameraRecord;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.TextView;

/**
 * Activity for displaying and starting the HelloWorld example on Android phone.
 *
 * @author Guillaume Beraudo
 *
 */
public class TestVideoActivity extends Activity {

	private SurfaceView surfaceView;
	private static final int rate = 7;

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videotest);

		surfaceView=(SurfaceView)findViewById(R.id.videotest_surfaceView);
		
//	    SurfaceHolder holder=surfaceView.getHolder();
//	    holder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
	    
		AndroidCameraRecord.RecorderParams params = new AndroidCameraRecord.RecorderParams(0);
		params.surfaceView = surfaceView;
		params.width = 352;
		params.height = 288;
		params.fps = rate;

	    JavaCameraRecordImpl recorder = new JavaCameraRecordImpl(params);
	    recorder.setDebug((TextView) findViewById(R.id.videotest_debug));
	    
	}
	
	


	

}
