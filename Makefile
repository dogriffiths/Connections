JAR = build/libs/Hipster-1.0-SNAPSHOT.jar
GRADLE = ./gradlew

clean:
	$(GRADLE) clean

build/libs/Hipster-1.0-SNAPSHOT.jar: src
	$(GRADLE) build

package: $(JAR)
	javapackager -deploy -native dmg -srcfiles $(JAR) -appclass com.herescreen.hipster.Main -name Hipster -outdir deploy -outfile Hipster
