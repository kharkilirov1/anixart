package kotlin.p033io.path;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PathTreeWalk.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m31884d2 = {"Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;", "", "<anonymous>"}, m31885k = 3, m31886mv = {1, 7, 1})
@DebugMetadata(m32125c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", m32126f = "PathTreeWalk.kt", m32127l = {184, 190}, m32128m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PathTreeWalk$bfsIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

    /* renamed from: d */
    public Object f63293d;

    /* renamed from: e */
    public Object f63294e;

    /* renamed from: f */
    public Object f63295f;

    /* renamed from: g */
    public Object f63296g;

    /* renamed from: h */
    public Object f63297h;

    /* renamed from: i */
    public int f63298i;

    /* renamed from: j */
    public /* synthetic */ Object f63299j;

    /* renamed from: k */
    public final /* synthetic */ PathTreeWalk f63300k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$bfsIterator$1(PathTreeWalk pathTreeWalk, Continuation<? super PathTreeWalk$bfsIterator$1> continuation) {
        super(2, continuation);
        this.f63300k = pathTreeWalk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: a */
    public final Continuation<Unit> mo2378a(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(this.f63300k, continuation);
        pathTreeWalk$bfsIterator$1.f63299j = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(SequenceScope<? super Path> sequenceScope, Continuation<? super Unit> continuation) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(this.f63300k, continuation);
        pathTreeWalk$bfsIterator$1.f63299j = sequenceScope;
        return pathTreeWalk$bfsIterator$1.mo2379m(Unit.f63088a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /* renamed from: m */
    public final Object mo2379m(@NotNull Object obj) {
        DirectoryEntriesReader directoryEntriesReader;
        ArrayDeque arrayDeque;
        SequenceScope sequenceScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f63298i;
        if (i2 == 0) {
            ResultKt.m31892b(obj);
            new ArrayDeque();
            Objects.requireNonNull(this.f63300k);
            ArraysKt.m31963m(null, PathWalkOption.FOLLOW_LINKS);
            throw null;
        }
        if (i2 == 1) {
            Path path = (Path) this.f63297h;
            PathTreeWalk pathTreeWalk = (PathTreeWalk) this.f63296g;
            PathNode pathNode = (PathNode) this.f63295f;
            DirectoryEntriesReader directoryEntriesReader2 = (DirectoryEntriesReader) this.f63294e;
            ArrayDeque arrayDeque2 = (ArrayDeque) this.f63293d;
            SequenceScope sequenceScope2 = (SequenceScope) this.f63299j;
            ResultKt.m31892b(obj);
            LinkOption[] m32144b = PathTreeWalk.m32144b(pathTreeWalk);
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(m32144b, m32144b.length);
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                arrayDeque2.addAll(directoryEntriesReader2.m32143a(pathNode));
            }
            directoryEntriesReader = directoryEntriesReader2;
            arrayDeque = arrayDeque2;
            sequenceScope = sequenceScope2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            directoryEntriesReader = (DirectoryEntriesReader) this.f63294e;
            arrayDeque = (ArrayDeque) this.f63293d;
            sequenceScope = (SequenceScope) this.f63299j;
            ResultKt.m31892b(obj);
        }
        while (!arrayDeque.isEmpty()) {
            PathNode pathNode2 = (PathNode) arrayDeque.removeFirst();
            PathTreeWalk pathTreeWalk2 = this.f63300k;
            Path path2 = pathNode2.f63289a;
            LinkOption[] m32144b2 = PathTreeWalk.m32144b(pathTreeWalk2);
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(m32144b2, m32144b2.length);
            if (Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                if (PathTreeWalkKt.m32145a(pathNode2)) {
                    throw new FileSystemLoopException(path2.toString());
                }
                ArraysKt.m31963m(null, PathWalkOption.INCLUDE_DIRECTORIES);
                throw null;
            }
            if (Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                this.f63299j = sequenceScope;
                this.f63293d = arrayDeque;
                this.f63294e = directoryEntriesReader;
                this.f63295f = null;
                this.f63296g = null;
                this.f63297h = null;
                this.f63298i = 2;
                if (sequenceScope.mo33827a(path2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return Unit.f63088a;
    }
}
