/**
 *
 * @author kkomac
 * @date 4/24/24
 */
class AudioPlayer : MediaPlayer {
    private lateinit var mediaAdapter: MediaAdapter

    override fun play(audioType: String, fileName: String) {
        if (audioType.equals("mp3", ignoreCase = true)) {
            println("Playing mp3 file. name : $fileName")
        } else if (audioType.equals("vlc", ignoreCase = true) || audioType.equals("mp4", ignoreCase = true)) {
            mediaAdapter = MediaAdapter(audioType)
            mediaAdapter.play(audioType, fileName)
        } else {
            println("Invalid media. $audioType format not supported")
        }
    }
}