Windows 10 Enterprise  22H2


```
java -version
openjdk version "21.0.3" 2024-04-16 LTS
OpenJDK Runtime Environment Temurin-21.0.3+9 (build 21.0.3+9-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.3+9 (build 21.0.3+9-LTS, mixed mode, sharing)
```

Error:
```
C:\Temp\openpdf_bug9650214420994590135\hello-in.pdf -> C:\Temp\openpdf_bug9650214420994590135\hello-out.pdf: Der Prozess kann nicht auf die Datei zugreifen, da sie von einem anderen Prozess verwendet wird
java.nio.file.FileSystemException: C:\Temp\openpdf_bug9650214420994590135\hello-in.pdf -> C:\Temp\openpdf_bug9650214420994590135\hello-out.pdf: Der Prozess kann nicht auf die Datei zugreifen, da sie von einem anderen Prozess verwendet wird
	at java.base/sun.nio.fs.WindowsException.translateToIOException(WindowsException.java:92)
	at java.base/sun.nio.fs.WindowsException.rethrowAsIOException(WindowsException.java:103)
	at java.base/sun.nio.fs.WindowsFileCopy.move(WindowsFileCopy.java:414)
	at java.base/sun.nio.fs.WindowsFileSystemProvider.move(WindowsFileSystemProvider.java:291)
	at java.base/java.nio.file.Files.move(Files.java:1430)
	at bug.Main.moveFile(Main.java:20)
```

