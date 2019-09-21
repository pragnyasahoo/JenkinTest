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
            //script(readFileFromWorkspace('PipeLinesript.groovy'))
            script(readFileFromWorkspace('pipelinestage.groovy'))
           
        }   
            
        }
    }