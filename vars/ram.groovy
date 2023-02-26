def newGit(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}
def newMaven()
{
    sh 'mvn package'
}
