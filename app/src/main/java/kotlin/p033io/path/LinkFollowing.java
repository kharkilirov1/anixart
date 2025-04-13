package kotlin.p033io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/io/path/LinkFollowing;", "", "kotlin-stdlib-jdk7"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class LinkFollowing {

    /* renamed from: a */
    @NotNull
    public static final LinkFollowing f63284a = new LinkFollowing();

    /* renamed from: b */
    @NotNull
    public static final LinkOption[] f63285b = {LinkOption.NOFOLLOW_LINKS};

    /* renamed from: c */
    @NotNull
    public static final LinkOption[] f63286c = new LinkOption[0];

    /* renamed from: d */
    @NotNull
    public static final Set<FileVisitOption> f63287d = EmptySet.f63146b;

    /* renamed from: e */
    @NotNull
    public static final Set<FileVisitOption> f63288e = SetsKt.m32079f(FileVisitOption.FOLLOW_LINKS);
}
