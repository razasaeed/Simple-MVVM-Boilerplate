package global.cloud.storage.network.fetch_files;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lglobal/cloud/storage/network/fetch_files/FetchFilesService;", "", "fetchFiles", "Lglobal/cloud/storage/models/FilesDataResponse;", "type", "", "page", "", "limit", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface FetchFilesService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "api/download/{type}")
    public abstract java.lang.Object fetchFiles(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "type")
    java.lang.String type, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "limit")
    int limit, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super global.cloud.storage.models.FilesDataResponse> continuation);
}