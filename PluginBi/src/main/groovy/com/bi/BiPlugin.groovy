package com.bi

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * <br> ClassName:   ${className}* <br> Description:
 * <br>
 * <br> @author:      谢文良
 * <br> Date:        2018/6/26 14:17
 */
class BiPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {
        target.logger.info("Bi-Start--------------")
//        if (project.plugins.hasPlugin(AppPlugin)) {
//            AppExtension android1 = target.extensions.getByType(AppExtension)
//            android1.registerTransform(new BiTransform(project))
//        }
    }
}
