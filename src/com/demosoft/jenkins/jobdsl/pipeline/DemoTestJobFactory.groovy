package com.demosoft.jenkins.jobdsl.pipeline

import groovy.transform.InheritConstructors
import com.qaprosoft.jenkins.jobdsl.pipeline.TestJobFactory


@InheritConstructors
class DemoTestJobFactory extends TestJobFactory {

	@Override
	def create() {
		def pipelineJob = super.create()

		pipelineJob.with {
			parameters {
				booleanParam('debug', fasle, 'enable or disable debug log level')
			}
		}
	}
}