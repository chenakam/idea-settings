#parse("Copyright.java")

package ${PACKAGE_NAME}

import android.app.Activity
import android.os.Bundle

#parse("File Header.java")
class ${NAME} extends Activity {
  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
#if (${LAYOUT_NAME} != "")
    setContentView(R.layout.${LAYOUT_NAME})
#end
  }
}
