# azure-tables-bug-by-incorrect-connection-string

a bug that causes the process to never terminate if the connection string is incorrect.

**this only occurs when using Azurite.**

## Usage

1. run table service on default port:
   ```shell
   docker run -p 10002:10002 mcr.microsoft.com/azure-storage/azurite azurite-table --tableHost 0.0.0.0
   ```
2. run the code:
   ```shell
   ./gradlew run
   ```
3. process never ends.
