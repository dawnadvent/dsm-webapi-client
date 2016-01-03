package net.jacqg.dsm.webapi.client.filestation.exception;

import net.jacqg.dsm.webapi.client.DsmWebApiResponseError;
import net.jacqg.dsm.webapi.client.exception.DsmWebApiErrorException;
import net.jacqg.dsm.webapi.client.filestation.common.ErrorCodes;

public class FileNotFoundException extends DsmWebApiErrorException {

    private final String path;

    public FileNotFoundException(String path) {
        super("No such file or directory", null);
        this.path = path;
    }

    public FileNotFoundException(Throwable cause, String path) {
        super("No such file or directory", cause, null);
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
