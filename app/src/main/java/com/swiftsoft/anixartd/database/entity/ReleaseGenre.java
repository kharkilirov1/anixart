package com.swiftsoft.anixartd.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseGenre.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ReleaseGenre;", "Ljava/io/Serializable;", "()V", "genre", "Lcom/swiftsoft/anixartd/database/entity/Genre;", "getGenre", "()Lcom/swiftsoft/anixartd/database/entity/Genre;", "setGenre", "(Lcom/swiftsoft/anixartd/database/entity/Genre;)V", "release", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getRelease", "()Lcom/swiftsoft/anixartd/database/entity/Release;", "setRelease", "(Lcom/swiftsoft/anixartd/database/entity/Release;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReleaseGenre implements Serializable {

    @Nullable
    private Genre genre;

    @Nullable
    private Release release;

    @Nullable
    public final Genre getGenre() {
        return this.genre;
    }

    @Nullable
    public final Release getRelease() {
        return this.release;
    }

    public final void setGenre(@Nullable Genre genre) {
        this.genre = genre;
    }

    public final void setRelease(@Nullable Release release) {
        this.release = release;
    }
}
