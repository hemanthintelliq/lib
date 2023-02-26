def newGit(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}

def newMaven()
{
    sh 'mvn package'
}
def newdeploy("jobname","ip","contextpath")
{
   sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${contextpath}.war"
}
def runselenium("jobname")
{
     sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
