def call(body) {
 def pipelineParams= [:]
 body.resolveStrategy = Closure.DELEGATE_FIRST
 body.delegate = pipelineParams
 body()
 	
 echo "Executing the shared generic pipeline for the application ${pipelineParams.appName}"
}