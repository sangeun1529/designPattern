/**
 *
 * @author kkomac
 * @date 4/24/24
 */
class AdapterPatternApp {
    fun run() {
        val audioPlayer = AudioPlayer()

        audioPlayer.play("mp3", "beyond the horizon.mp3")
        audioPlayer.play("mp4", "alone.mp4")
        audioPlayer.play("vlc", "far far away.vlc")
        audioPlayer.play("avi", "mind me.avi")
    }
}