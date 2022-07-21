#parse("Copyright.java")

package ${PACKAGE_NAME}

import android.app.Fragment
import android.os.Bundle
import android.view.{LayoutInflater, View, ViewGroup}

#parse("File Header.java")
class ${NAME} extends Fragment {
  override def onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle): View = {
#if (${LAYOUT_NAME} == "")
    null
#else
    inflater.inflate(R.layout.${LAYOUT_NAME}, container, false)
#end
  }
}