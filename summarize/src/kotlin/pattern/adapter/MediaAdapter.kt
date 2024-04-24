/**
 *
 * @author kkomac
 * @date 4/24/24
 */
class MediaAdapter(audioType: String) : MediaPlayer {
    lateinit var advancedMediaPlayer: AdvancedMediaPlayer

    init {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMediaPlayer = VlcPlayer()
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMediaPlayer = Mp4Player()
        }
    }


    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("vlc", ignoreCase = true)) {
            advancedMediaPlayer.playVlc(fileName)
        } else if (audioType.equals("mp4", ignoreCase = true)) {
            advancedMediaPlayer.playMp4(fileName)
        }
    }
}