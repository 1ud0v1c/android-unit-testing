import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class RemoteConfigGeneratorTask : DefaultTask() {
    @TaskAction
    fun taskAction() {
        val projectName = project.parent?.name
        println("projectName: $projectName")
    }

    companion object {
        const val TASK_NAME = "remote_config_generator"
    }
}