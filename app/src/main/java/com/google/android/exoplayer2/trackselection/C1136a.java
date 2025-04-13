package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import com.airbnb.epoxy.EpoxyModel;
import com.google.android.datatransport.Transformer;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.C1123j;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverrides;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.cache.C1169a;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Util;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.p015ui.controller.main.bookmarks.BookmarksTabUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionListUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionProfileListUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.filtered.FilteredUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.home.CustomFilterTabUiController;
import io.grpc.ClientCall;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.trackselection.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1136a implements Bundleable.Creator, CacheKeyFactory, TextInputLayout.LengthCounter, LibraryVersionComponent.VersionExtractor, ImmutableSortedMap.Builder.KeyTranslator, Continuation, Function, OnSuccessListener, Transformer, OnFailureListener, EpoxyModel.SpanSizeOverrideCallback {

    /* renamed from: c */
    public static final /* synthetic */ C1136a f14036c = new C1136a(1);

    /* renamed from: d */
    public static final /* synthetic */ C1136a f14037d = new C1136a(2);

    /* renamed from: e */
    public static final /* synthetic */ C1136a f14038e = new C1136a(3);

    /* renamed from: f */
    public static final /* synthetic */ C1136a f14039f = new C1136a(5);

    /* renamed from: g */
    public static final /* synthetic */ C1136a f14040g = new C1136a(6);

    /* renamed from: h */
    public static final /* synthetic */ C1136a f14041h = new C1136a(8);

    /* renamed from: i */
    public static final /* synthetic */ C1136a f14042i = new C1136a(9);

    /* renamed from: j */
    public static final /* synthetic */ C1136a f14043j = new C1136a(10);

    /* renamed from: k */
    public static final /* synthetic */ C1136a f14044k = new C1136a(11);

    /* renamed from: l */
    public static final /* synthetic */ C1136a f14045l = new C1136a(12);

    /* renamed from: m */
    public static final /* synthetic */ C1136a f14046m = new C1136a(13);

    /* renamed from: n */
    public static final /* synthetic */ C1136a f14047n = new C1136a(17);

    /* renamed from: o */
    public static final /* synthetic */ C1136a f14048o = new C1136a(18);

    /* renamed from: p */
    public static final /* synthetic */ C1136a f14049p = new C1136a(19);

    /* renamed from: q */
    public static final /* synthetic */ C1136a f14050q = new C1136a(20);

    /* renamed from: r */
    public static final /* synthetic */ C1136a f14051r = new C1136a(21);

    /* renamed from: s */
    public static final /* synthetic */ C1136a f14052s = new C1136a(22);

    /* renamed from: t */
    public static final /* synthetic */ C1136a f14053t = new C1136a(23);

    /* renamed from: u */
    public static final /* synthetic */ C1136a f14054u = new C1136a(24);

    /* renamed from: v */
    public static final /* synthetic */ C1136a f14055v = new C1136a(25);

    /* renamed from: w */
    public static final /* synthetic */ C1136a f14056w = new C1136a(26);

    /* renamed from: x */
    public static final /* synthetic */ C1136a f14057x = new C1136a(27);

    /* renamed from: y */
    public static final /* synthetic */ C1136a f14058y = new C1136a(28);

    /* renamed from: z */
    public static final /* synthetic */ C1136a f14059z = new C1136a(29);

    /* renamed from: b */
    public final /* synthetic */ int f14060b;

    public /* synthetic */ C1136a(int i2) {
        this.f14060b = i2;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    /* renamed from: a */
    public void mo7337a(Exception exception) {
        switch (this.f14060b) {
            case 21:
                Intrinsics.m32179h(exception, "exception");
                exception.printStackTrace();
                break;
            default:
                Intrinsics.m32179h(exception, "exception");
                exception.printStackTrace();
                break;
        }
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        switch (this.f14060b) {
            case 15:
                return Boolean.valueOf(((FieldFilter) obj).m12396d());
            default:
                MessagingClientEventExtension messagingClientEventExtension = (MessagingClientEventExtension) obj;
                Objects.requireNonNull(messagingClientEventExtension);
                ProtobufEncoder protobufEncoder = ProtoEncoderDoNotUse.f23301a;
                Objects.requireNonNull(protobufEncoder);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    protobufEncoder.m12386a(messagingClientEventExtension, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    /* renamed from: b */
    public int mo7338b(Editable editable) {
        int[][] iArr = TextInputLayout.f19073z0;
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    /* renamed from: c */
    public String mo7339c(Object obj) {
        switch (this.f14060b) {
            case 9:
                ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 10:
                ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                return (applicationInfo2 == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo2.minSdkVersion);
            case 11:
                Context context = (Context) obj;
                int i2 = Build.VERSION.SDK_INT;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : (i2 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i2 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto";
            default:
                Context context2 = (Context) obj;
                String installerPackageName = context2.getPackageManager().getInstallerPackageName(context2.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.m12221a(installerPackageName) : "";
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel.SpanSizeOverrideCallback
    /* renamed from: d */
    public int mo4530d(int i2, int i3, int i4) {
        int buildModels$lambda$1$lambda$0;
        int buildModels$lambda$1$lambda$02;
        int buildModels$lambda$3$lambda$2;
        int buildModels$lambda$3$lambda$22;
        int buildModels$lambda$2$lambda$1;
        int buildModels$lambda$1$lambda$03;
        int buildModels$lambda$3$lambda$23;
        switch (this.f14060b) {
            case 23:
                buildModels$lambda$1$lambda$02 = BookmarksTabUiController.buildModels$lambda$1$lambda$0(i2, i3, i4);
                return buildModels$lambda$1$lambda$02;
            case 24:
                buildModels$lambda$3$lambda$2 = BookmarksTabUiController.buildModels$lambda$3$lambda$2(i2, i3, i4);
                return buildModels$lambda$3$lambda$2;
            case 25:
                buildModels$lambda$3$lambda$22 = CollectionListUiController.buildModels$lambda$3$lambda$2(i2, i3, i4);
                return buildModels$lambda$3$lambda$22;
            case 26:
                buildModels$lambda$2$lambda$1 = CollectionProfileListUiController.buildModels$lambda$2$lambda$1(i2, i3, i4);
                return buildModels$lambda$2$lambda$1;
            case 27:
                buildModels$lambda$1$lambda$03 = FilteredUiController.buildModels$lambda$1$lambda$0(i2, i3, i4);
                return buildModels$lambda$1$lambda$03;
            case 28:
                buildModels$lambda$3$lambda$23 = FilteredUiController.buildModels$lambda$3$lambda$2(i2, i3, i4);
                return buildModels$lambda$3$lambda$23;
            default:
                buildModels$lambda$1$lambda$0 = CustomFilterTabUiController.buildModels$lambda$1$lambda$0(i2, i3, i4);
                return buildModels$lambda$1$lambda$0;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    /* renamed from: e */
    public Object mo7340e(Task task) {
        switch (this.f14060b) {
            case 14:
                return task.mo9712q() ? Tasks.m9723e(((AppCheckTokenResult) task.mo9708m()).m12227a()) : Tasks.m9722d(task.mo9707l());
            case 15:
            case 16:
            default:
                Object obj = FcmBroadcastProcessor.f23259c;
                return Integer.valueOf(Response.PERM_BANNED);
            case 17:
                int i2 = Util.f23027a;
                if (task.mo9712q()) {
                    return (Void) task.mo9708m();
                }
                Exception mo9707l = task.mo9707l();
                if (mo9707l instanceof StatusException) {
                    mo9707l = Util.m12501e(((StatusException) mo9707l).f58315b);
                } else if (mo9707l instanceof StatusRuntimeException) {
                    mo9707l = Util.m12501e(((StatusRuntimeException) mo9707l).f58318b);
                }
                if (mo9707l instanceof FirebaseFirestoreException) {
                    throw mo9707l;
                }
                throw new FirebaseFirestoreException(mo9707l.getMessage(), FirebaseFirestoreException.Code.UNKNOWN, mo9707l);
            case 18:
                Object obj2 = FcmBroadcastProcessor.f23259c;
                return -1;
        }
    }

    @Override // com.google.firebase.database.collection.ImmutableSortedMap.Builder.KeyTranslator
    /* renamed from: f */
    public Object mo7341f(Object obj) {
        ImmutableSortedMap.Builder.KeyTranslator keyTranslator = ImmutableSortedMap.Builder.f22541a;
        return obj;
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        switch (this.f14060b) {
            case 0:
                DefaultTrackSelector.Parameters parameters = DefaultTrackSelector.Parameters.f13908N;
                return new DefaultTrackSelector.ParametersBuilder(bundle, (DefaultTrackSelector.C11341) null).m7320f();
            case 1:
                int i2 = bundle.getInt(DefaultTrackSelector.SelectionOverride.m7322b(0), -1);
                int[] intArray = bundle.getIntArray(DefaultTrackSelector.SelectionOverride.m7322b(1));
                int i3 = bundle.getInt(DefaultTrackSelector.SelectionOverride.m7322b(2), -1);
                Assertions.m7513a(i2 >= 0 && i3 >= 0);
                Objects.requireNonNull(intArray);
                return new DefaultTrackSelector.SelectionOverride(i2, intArray, i3);
            case 2:
                TrackSelectionOverrides trackSelectionOverrides = TrackSelectionOverrides.f13973c;
                List m7523b = BundleableUtil.m7523b(TrackSelectionOverrides.TrackSelectionOverride.f13977d, bundle.getParcelableArrayList(Integer.toString(0, 36)), ImmutableList.m11627D());
                ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
                for (int i4 = 0; i4 < m7523b.size(); i4++) {
                    TrackSelectionOverrides.TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverrides.TrackSelectionOverride) m7523b.get(i4);
                    builder.mo11614c(trackSelectionOverride.f13978b, trackSelectionOverride);
                }
                return new TrackSelectionOverrides(builder.mo11613a());
            case 3:
                Bundle bundle2 = bundle.getBundle(TrackSelectionOverrides.TrackSelectionOverride.m7329c(0));
                Objects.requireNonNull(bundle2);
                TrackGroup trackGroup = (TrackGroup) ((C1123j) TrackGroup.f12588e).fromBundle(bundle2);
                int[] intArray2 = bundle.getIntArray(TrackSelectionOverrides.TrackSelectionOverride.m7329c(1));
                return intArray2 == null ? new TrackSelectionOverrides.TrackSelectionOverride(trackGroup) : new TrackSelectionOverrides.TrackSelectionOverride(trackGroup, Ints.m12079a(intArray2));
            case 4:
                TrackSelectionParameters trackSelectionParameters = TrackSelectionParameters.f13980z;
                return new TrackSelectionParameters(new TrackSelectionParameters.Builder(bundle));
            case 5:
            default:
                return new VideoSize(bundle.getInt(VideoSize.m7820b(0), 0), bundle.getInt(VideoSize.m7820b(1), 0), bundle.getInt(VideoSize.m7820b(2), 0), bundle.getFloat(VideoSize.m7820b(3), 1.0f));
            case 6:
                return new ColorInfo(bundle.getInt(ColorInfo.m7766d(0), -1), bundle.getInt(ColorInfo.m7766d(1), -1), bundle.getInt(ColorInfo.m7766d(2), -1), bundle.getByteArray(ColorInfo.m7766d(3)));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
    /* renamed from: g */
    public String mo7342g(DataSpec dataSpec) {
        int i2 = C1169a.f14607a;
        String str = dataSpec.f14369h;
        return str != null ? str : dataSpec.f14362a.toString();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((ClientCall) obj).mo12487b();
    }
}
