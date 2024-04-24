/**
 *
 * @author kkomac
 * @date 4/24/24
 */
class Mp4Player : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
    }

    override fun playMp4(fileName: String) {
        println("Playing mp4 file. name : $fileName")
    }
}