package day4

/**
  * Created by doctorq on 2017/6/10.
  */
abstract class Device

case class Phone(model: String) extends Device {
  def screenOff = "Turning screen off"
}

case class Computer(model: String) extends Device {
  def screenSaveOn = "Turning screen saver on..."
}

class MatchOnTypeOnly {

  def goIdel(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaveOn
  }
}