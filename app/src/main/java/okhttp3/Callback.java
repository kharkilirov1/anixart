package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Callback.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m31884d2 = {"Lokhttp3/Callback;", "", "onFailure", "", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface Callback {
    void onFailure(@NotNull Call call, @NotNull IOException e2);

    void onResponse(@NotNull Call call, @NotNull Response response) throws IOException;
}
