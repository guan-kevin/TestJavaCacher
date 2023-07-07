version=$(curl -s https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/maven-metadata.xml | grep "<release")
regex='<release>(.+)</release>'
if [[ $version =~ $regex ]]
then
    latest_version=${BASH_REMATCH[1]}
    echo "Create Maven Wrapper Version: ${latest_version}"
    mvn wrapper:wrapper -Dmaven=${latest_version}
else
    echo "Failed to Find The Latest Maven Wrapper"
fi