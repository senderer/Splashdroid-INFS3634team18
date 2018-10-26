package unsw.infs3634.assignment.splashdroid.Videos;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import unsw.infs3634.assignment.splashdroid.R;

public class VideoActivity1 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    public static final String API_KEY = "AIzaSyBNhmf7pJjuUao2P_yg4Rug1PKdOTtLRic";
    public static final String VIDEO_ID = "Iva-IEv_sTg";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player1);

        //Initialize YouTube Player View //
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(API_KEY, this);
    }
    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "Failed to Initialize", Toast.LENGTH_LONG).show();
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                /* add listeners to YOuTubePlayer instance */
                youTubePlayer.setPlayerStateChangeListener(playerStateChangeListener);
                youTubePlayer.setPlaybackEventListener(playbackEventListener);

                /* Start buffering */
                if (!b) {
                    youTubePlayer.loadVideo(VIDEO_ID);
                }

            }
            private YouTubePlayer.PlayerStateChangeListener playerStateChangeListener = new YouTubePlayer.PlayerStateChangeListener() {
                @Override
                public void onLoading() {

                }

                @Override
                public void onLoaded(String s) {

                }

                @Override
                public void onAdStarted() {

                }

                @Override
                public void onVideoStarted() {

                }

                @Override
                public void onVideoEnded() {

                }

                @Override
                public void onError(YouTubePlayer.ErrorReason errorReason) {

                }
            };

            private PlaybackEventListener playbackEventListener = new PlaybackEventListener() {
                @Override
                public void onPlaying() {

                }

                @Override
                public void onPaused() {

                }

                @Override
                public void onStopped() {

                }

                @Override
                public void onBuffering(boolean b) {

                }

                @Override
                public void onSeekTo(int i) {

                }
            };
}



