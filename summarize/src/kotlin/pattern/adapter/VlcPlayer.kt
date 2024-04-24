/**
 *
 * @author kkomac
 * @date 4/24/24
 */
class VlcPlayer : AdvancedMediaPlayer {
    override fun playVlc(fileName: String) {
        println("Playing VLC File. name = $fileName")
    }

    override fun playMp4(fileName: String) {
    }
}