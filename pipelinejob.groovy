pipelineJob('pipelinejob') {

    
    definition {
        cps {
            //script(readFileFromWorkspace('PipeLinesript.groovy'))
            script(readFileFromWorkspace('pipelinestage.groovy'))
           
        }   
            
        }
    }