JAR = build/libs/Connections-1.0-SNAPSHOT.jar
GRADLE = ./gradlew

clean:
	$(GRADLE) clean

$(JAR): src
	$(GRADLE) build

package: $(JAR)
	javapackager -deploy -native dmg -srcfiles $(JAR) -appclass com.herescreen.connections.Connections -name Connections -outdir deploy -outfile Connections
