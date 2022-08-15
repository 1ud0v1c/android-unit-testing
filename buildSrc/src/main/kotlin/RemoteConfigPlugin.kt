import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

class RemoteConfigPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register<RemoteConfigGeneratorTask>(RemoteConfigGeneratorTask.TASK_NAME) {
            dependsOn(BUILD_TASK)
        }
    }

    companion object {
        private const val BUILD_TASK = "build"
    }
}