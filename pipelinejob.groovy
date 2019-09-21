pipelineJob('pipelinejob') {

     scm {
        git {
            remote {
                name('origin')
                url('https://github.com/pragnyasahoo/JenkinTest.git')
            }
        }
      }

    definition {
        cps {
            script(readFileFromWorkspace('PipeLinesript.groovy'))
            sandbox()
        }
    }

    job('mypiplplinejob') {
    description('My first job')
}
}