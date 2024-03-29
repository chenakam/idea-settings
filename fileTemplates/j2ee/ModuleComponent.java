#parse("Copyright.java")

package ${PACKAGE_NAME};

import com.intellij.openapi.module.ModuleComponent;
import com.intellij.openapi.module.Module;
import org.jetbrains.annotations.NotNull;

#parse("File Header.java")
public class ${NAME} implements ModuleComponent {
    public ${NAME}(Module module) {
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

    @Override
    public void projectOpened() {
        // called when project is opened
    }

    @Override
    public void projectClosed() {
        // called when project is being closed
    }

    @Override
    public void moduleAdded() {
       // Invoked when the module corresponding to this component instance has been completely
       // loaded and added to the project.
    }
}
