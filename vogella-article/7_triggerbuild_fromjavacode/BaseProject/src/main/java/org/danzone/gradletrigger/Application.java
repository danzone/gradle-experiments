package org.danzone.gradletrigger;

import java.io.File;

import org.gradle.tooling.BuildLauncher;
import org.gradle.tooling.GradleConnector;
import org.gradle.tooling.ProjectConnection;

public class Application {

	private static final String TARGET_PROJECT_PATH = "/home/daniele/Progetti/Sviluppo/Gradle/get-start/vogella-article/7_triggerbuild_fromjavacode/TargetProject";

	public static void main(String[] args) {
		ProjectConnection connection = GradleConnector.newConnector().forProjectDirectory(new File(TARGET_PROJECT_PATH)).connect();
		try {
			BuildLauncher build = connection.newBuild();
			build.forTasks("build");
			build.run();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}