#parse("Copyright.java")

package ${PACKAGE_NAME};

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

#parse("File Header.java")
public class ${NAME} implements ApplicationComponent {
    public ${NAME}() {
    }

    @Override
    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    @Override
    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @Override
    @NotNull
    public String getComponentName() {
        return "${NAME}";
    }
}
