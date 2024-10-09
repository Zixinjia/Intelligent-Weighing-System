import LinsChart from './chart/LinsChart'

@Entry
@Component
struct Test {
  build() {
    Stack() {
      LinsChart({
        axisStyle: "#000",
        linesStyle: "#000"
      })
        .width("100%")
        .height("100%")
    }
    .width("100%").height("100%")
    // .backgroundColor(Color.Red)
  }
}