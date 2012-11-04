package jenkins.mvn;

import hudson.Extension;
import hudson.FilePath;
import hudson.model.AbstractBuild;
import hudson.model.TaskListener;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 * @since 1.490
 */
public class DefaultSettingsProvider extends SettingsProvider {

    @DataBoundConstructor
    public DefaultSettingsProvider() {
    }

    @Override
    public FilePath supplySettings(AbstractBuild<?, ?> project, TaskListener listener) {
        return null;
    }

    @Extension(ordinal = 99)
    public static class DescriptorImpl extends SettingsProviderDescriptor {

        @Override
        public String getDisplayName() {
            return "Use default maven settings";
        }
    }
}
