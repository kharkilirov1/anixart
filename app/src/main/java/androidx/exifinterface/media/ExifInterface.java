package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterfaceUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ExifInterface {

    /* renamed from: E */
    public static final String[] f4139E;

    /* renamed from: F */
    public static final int[] f4140F;

    /* renamed from: G */
    public static final byte[] f4141G;

    /* renamed from: H */
    public static final ExifTag f4142H;

    /* renamed from: I */
    public static final ExifTag[][] f4143I;

    /* renamed from: J */
    public static final ExifTag[] f4144J;

    /* renamed from: K */
    public static final HashMap<Integer, ExifTag>[] f4145K;

    /* renamed from: L */
    public static final HashMap<String, ExifTag>[] f4146L;

    /* renamed from: M */
    public static final HashSet<String> f4147M;

    /* renamed from: N */
    public static final HashMap<Integer, Integer> f4148N;

    /* renamed from: O */
    public static final Charset f4149O;

    /* renamed from: P */
    public static final byte[] f4150P;

    /* renamed from: Q */
    public static final byte[] f4151Q;

    /* renamed from: a */
    public FileDescriptor f4166a;

    /* renamed from: b */
    public AssetManager.AssetInputStream f4167b;

    /* renamed from: c */
    public int f4168c;

    /* renamed from: d */
    public boolean f4169d;

    /* renamed from: e */
    public final HashMap<String, ExifAttribute>[] f4170e;

    /* renamed from: f */
    public Set<Integer> f4171f;

    /* renamed from: g */
    public ByteOrder f4172g;

    /* renamed from: h */
    public boolean f4173h;

    /* renamed from: i */
    public int f4174i;

    /* renamed from: j */
    public int f4175j;

    /* renamed from: k */
    public int f4176k;

    /* renamed from: l */
    public int f4177l;

    /* renamed from: m */
    public static final boolean f4152m = Log.isLoggable("ExifInterface", 3);

    /* renamed from: n */
    public static final List<Integer> f4153n = Arrays.asList(1, 6, 3, 8);

    /* renamed from: o */
    public static final List<Integer> f4154o = Arrays.asList(2, 7, 4, 5);

    /* renamed from: p */
    public static final int[] f4155p = {8, 8, 8};

    /* renamed from: q */
    public static final int[] f4156q = {8};

    /* renamed from: r */
    public static final byte[] f4157r = {-1, -40, -1};

    /* renamed from: s */
    public static final byte[] f4158s = {102, 116, 121, 112};

    /* renamed from: t */
    public static final byte[] f4159t = {109, 105, 102, 49};

    /* renamed from: u */
    public static final byte[] f4160u = {104, 101, 105, 99};

    /* renamed from: v */
    public static final byte[] f4161v = {79, 76, 89, 77, 80, 0};

    /* renamed from: w */
    public static final byte[] f4162w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: x */
    public static final byte[] f4163x = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: y */
    public static final byte[] f4164y = {101, 88, 73, 102};

    /* renamed from: z */
    public static final byte[] f4165z = {73, 72, 68, 82};

    /* renamed from: A */
    public static final byte[] f4135A = {73, 69, 78, 68};

    /* renamed from: B */
    public static final byte[] f4136B = {82, 73, 70, 70};

    /* renamed from: C */
    public static final byte[] f4137C = {87, 69, 66, 80};

    /* renamed from: D */
    public static final byte[] f4138D = {69, 88, 73, 70};

    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            throw null;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) throws IOException {
            throw null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ExifStreamType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IfdType {
    }

    public static class Rational {

        /* renamed from: a */
        public final long f4193a;

        /* renamed from: b */
        public final long f4194b;

        public Rational(long j2, long j3) {
            if (j3 == 0) {
                this.f4193a = 0L;
                this.f4194b = 1L;
            } else {
                this.f4193a = j2;
                this.f4194b = j3;
            }
        }

        public String toString() {
            return this.f4193a + "/" + this.f4194b;
        }
    }

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f4139E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f4140F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f4141G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ExifTag[] exifTagArr = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new ExifTag("ImageWidth", 256, 3, 4), new ExifTag("ImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        ExifTag[] exifTagArr2 = {new ExifTag("ExposureTime", 33434, 5), new ExifTag("FNumber", 33437, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 34852, 2), new ExifTag("PhotographicSensitivity", 34855, 3), new ExifTag("OECF", 34856, 7), new ExifTag("SensitivityType", 34864, 3), new ExifTag("StandardOutputSensitivity", 34865, 4), new ExifTag("RecommendedExposureIndex", 34866, 4), new ExifTag("ISOSpeed", 34867, 4), new ExifTag("ISOSpeedLatitudeyyy", 34868, 4), new ExifTag("ISOSpeedLatitudezzz", 34869, 4), new ExifTag("ExifVersion", 36864, 2), new ExifTag("DateTimeOriginal", 36867, 2), new ExifTag("DateTimeDigitized", 36868, 2), new ExifTag("OffsetTime", 36880, 2), new ExifTag("OffsetTimeOriginal", 36881, 2), new ExifTag("OffsetTimeDigitized", 36882, 2), new ExifTag("ComponentsConfiguration", 37121, 7), new ExifTag("CompressedBitsPerPixel", 37122, 5), new ExifTag("ShutterSpeedValue", 37377, 10), new ExifTag("ApertureValue", 37378, 5), new ExifTag("BrightnessValue", 37379, 10), new ExifTag("ExposureBiasValue", 37380, 10), new ExifTag("MaxApertureValue", 37381, 5), new ExifTag("SubjectDistance", 37382, 5), new ExifTag("MeteringMode", 37383, 3), new ExifTag("LightSource", 37384, 3), new ExifTag("Flash", 37385, 3), new ExifTag("FocalLength", 37386, 5), new ExifTag("SubjectArea", 37396, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 37520, 2), new ExifTag("SubSecTimeOriginal", 37521, 2), new ExifTag("SubSecTimeDigitized", 37522, 2), new ExifTag("FlashpixVersion", 40960, 7), new ExifTag("ColorSpace", 40961, 3), new ExifTag("PixelXDimension", 40962, 3, 4), new ExifTag("PixelYDimension", 40963, 3, 4), new ExifTag("RelatedSoundFile", 40964, 2), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("FlashEnergy", 41483, 5), new ExifTag("SpatialFrequencyResponse", 41484, 7), new ExifTag("FocalPlaneXResolution", 41486, 5), new ExifTag("FocalPlaneYResolution", 41487, 5), new ExifTag("FocalPlaneResolutionUnit", 41488, 3), new ExifTag("SubjectLocation", 41492, 3), new ExifTag("ExposureIndex", 41493, 5), new ExifTag("SensingMethod", 41495, 3), new ExifTag("FileSource", 41728, 7), new ExifTag("SceneType", 41729, 7), new ExifTag("CFAPattern", 41730, 7), new ExifTag("CustomRendered", 41985, 3), new ExifTag("ExposureMode", 41986, 3), new ExifTag("WhiteBalance", 41987, 3), new ExifTag("DigitalZoomRatio", 41988, 5), new ExifTag("FocalLengthIn35mmFilm", 41989, 3), new ExifTag("SceneCaptureType", 41990, 3), new ExifTag("GainControl", 41991, 3), new ExifTag("Contrast", 41992, 3), new ExifTag("Saturation", 41993, 3), new ExifTag("Sharpness", 41994, 3), new ExifTag("DeviceSettingDescription", 41995, 7), new ExifTag("SubjectDistanceRange", 41996, 3), new ExifTag("ImageUniqueID", 42016, 2), new ExifTag("CameraOwnerName", 42032, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 42240, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        ExifTag[] exifTagArr3 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5, 10), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5, 10), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 31, 5)};
        ExifTag[] exifTagArr4 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifTag[] exifTagArr5 = {new ExifTag("NewSubfileType", 254, 4), new ExifTag("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new ExifTag("ThumbnailImageWidth", 256, 3, 4), new ExifTag("ThumbnailImageLength", 257, 3, 4), new ExifTag("BitsPerSample", 258, 3), new ExifTag("Compression", 259, 3), new ExifTag("PhotometricInterpretation", 262, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 271, 2), new ExifTag("Model", 272, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 319, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 513, 4), new ExifTag("JPEGInterchangeFormatLength", 514, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 33432, 2), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        f4142H = new ExifTag("StripOffsets", 273, 3);
        f4143I = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, new ExifTag[]{new ExifTag("ThumbnailImage", 256, 7), new ExifTag("CameraSettingsIFDPointer", 8224, 4), new ExifTag("ImageProcessingIFDPointer", 8256, 4)}, new ExifTag[]{new ExifTag("PreviewImageStart", 257, 4), new ExifTag("PreviewImageLength", 258, 4)}, new ExifTag[]{new ExifTag("AspectFrame", 4371, 3)}, new ExifTag[]{new ExifTag("ColorSpace", 55, 3)}};
        f4144J = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 34665, 4), new ExifTag("GPSInfoIFDPointer", 34853, 4), new ExifTag("InteroperabilityIFDPointer", 40965, 4), new ExifTag("CameraSettingsIFDPointer", 8224, 1), new ExifTag("ImageProcessingIFDPointer", 8256, 1)};
        f4145K = new HashMap[10];
        f4146L = new HashMap[10];
        f4147M = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f4148N = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f4149O = forName;
        f4150P = "Exif\u0000\u0000".getBytes(forName);
        f4151Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            ExifTag[][] exifTagArr6 = f4143I;
            if (i2 >= exifTagArr6.length) {
                HashMap<Integer, Integer> hashMap = f4148N;
                ExifTag[] exifTagArr7 = f4144J;
                hashMap.put(Integer.valueOf(exifTagArr7[0].f4189a), 5);
                hashMap.put(Integer.valueOf(exifTagArr7[1].f4189a), 1);
                hashMap.put(Integer.valueOf(exifTagArr7[2].f4189a), 2);
                hashMap.put(Integer.valueOf(exifTagArr7[3].f4189a), 3);
                hashMap.put(Integer.valueOf(exifTagArr7[4].f4189a), 7);
                hashMap.put(Integer.valueOf(exifTagArr7[5].f4189a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f4145K[i2] = new HashMap<>();
            f4146L[i2] = new HashMap<>();
            for (ExifTag exifTag : exifTagArr6[i2]) {
                f4145K[i2].put(Integer.valueOf(exifTag.f4189a), exifTag);
                f4146L[i2].put(exifTag.f4190b, exifTag);
            }
            i2++;
        }
    }

    public ExifInterface(@NonNull InputStream inputStream) throws IOException {
        boolean z;
        ExifTag[][] exifTagArr = f4143I;
        this.f4170e = new HashMap[exifTagArr.length];
        this.f4171f = new HashSet(exifTagArr.length);
        this.f4172g = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f4167b = (AssetManager.AssetInputStream) inputStream;
            this.f4166a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    ExifInterfaceUtils.Api21Impl.m2933c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z = true;
                } catch (Exception unused) {
                    if (f4152m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z = false;
                }
                if (z) {
                    this.f4167b = null;
                    this.f4166a = fileInputStream.getFD();
                }
            }
            this.f4167b = null;
            this.f4166a = null;
        }
        for (int i2 = 0; i2 < f4143I.length; i2++) {
            try {
                try {
                    this.f4170e[i2] = new HashMap<>();
                } finally {
                    m2892a();
                    if (f4152m) {
                        m2909r();
                    }
                }
            } catch (IOException | UnsupportedOperationException e2) {
                boolean z2 = f4152m;
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                }
                m2892a();
                if (!z2) {
                    return;
                }
            }
        }
        if (!this.f4169d) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f4168c = m2898g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i3 = this.f4168c;
        if ((i3 == 4 || i3 == 9 || i3 == 13 || i3 == 14) ? false : true) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(inputStream);
            if (this.f4169d) {
                m2904m(seekableByteOrderedDataInputStream);
            } else {
                int i4 = this.f4168c;
                if (i4 == 12) {
                    m2896e(seekableByteOrderedDataInputStream);
                } else if (i4 == 7) {
                    m2899h(seekableByteOrderedDataInputStream);
                } else if (i4 == 10) {
                    m2903l(seekableByteOrderedDataInputStream);
                } else {
                    m2902k(seekableByteOrderedDataInputStream);
                }
            }
            seekableByteOrderedDataInputStream.m2928c(this.f4174i);
            m2914w(seekableByteOrderedDataInputStream);
        } else {
            ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(inputStream, ByteOrder.BIG_ENDIAN);
            int i5 = this.f4168c;
            if (i5 == 4) {
                m2897f(byteOrderedDataInputStream, 0, 0);
            } else if (i5 == 13) {
                m2900i(byteOrderedDataInputStream);
            } else if (i5 == 9) {
                m2901j(byteOrderedDataInputStream);
            } else if (i5 == 14) {
                m2905n(byteOrderedDataInputStream);
            }
        }
    }

    /* renamed from: a */
    public final void m2892a() {
        String m2893b = m2893b("DateTimeOriginal");
        if (m2893b != null && m2893b("DateTime") == null) {
            this.f4170e[0].put("DateTime", ExifAttribute.m2920a(m2893b));
        }
        if (m2893b("ImageWidth") == null) {
            this.f4170e[0].put("ImageWidth", ExifAttribute.m2921b(0L, this.f4172g));
        }
        if (m2893b("ImageLength") == null) {
            this.f4170e[0].put("ImageLength", ExifAttribute.m2921b(0L, this.f4172g));
        }
        if (m2893b("Orientation") == null) {
            this.f4170e[0].put("Orientation", ExifAttribute.m2921b(0L, this.f4172g));
        }
        if (m2893b("LightSource") == null) {
            this.f4170e[1].put("LightSource", ExifAttribute.m2921b(0L, this.f4172g));
        }
    }

    @Nullable
    /* renamed from: b */
    public String m2893b(@NonNull String str) {
        ExifAttribute m2895d = m2895d(str);
        if (m2895d != null) {
            if (!f4147M.contains(str)) {
                return m2895d.m2926g(this.f4172g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i2 = m2895d.f4185a;
                if (i2 != 5 && i2 != 10) {
                    StringBuilder m24u = C0000a.m24u("GPS Timestamp format is not rational. format=");
                    m24u.append(m2895d.f4185a);
                    Log.w("ExifInterface", m24u.toString());
                    return null;
                }
                Rational[] rationalArr = (Rational[]) m2895d.m2927h(this.f4172g);
                if (rationalArr != null && rationalArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (rationalArr[0].f4193a / rationalArr[0].f4194b)), Integer.valueOf((int) (rationalArr[1].f4193a / rationalArr[1].f4194b)), Integer.valueOf((int) (rationalArr[2].f4193a / rationalArr[2].f4194b)));
                }
                StringBuilder m24u2 = C0000a.m24u("Invalid GPS Timestamp array. array=");
                m24u2.append(Arrays.toString(rationalArr));
                Log.w("ExifInterface", m24u2.toString());
                return null;
            }
            try {
                return Double.toString(m2895d.m2924e(this.f4172g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public int m2894c(@NonNull String str, int i2) {
        ExifAttribute m2895d = m2895d(str);
        if (m2895d == null) {
            return i2;
        }
        try {
            return m2895d.m2925f(this.f4172g);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    @Nullable
    /* renamed from: d */
    public final ExifAttribute m2895d(@NonNull String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f4152m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i2 = 0; i2 < f4143I.length; i2++) {
            ExifAttribute exifAttribute = this.f4170e[i2].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m2896e(final SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                ExifInterfaceUtils.Api23Impl.m2934a(mediaMetadataRetriever, new MediaDataSource(this) { // from class: androidx.exifinterface.media.ExifInterface.1

                    /* renamed from: b */
                    public long f4178b;

                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                    }

                    @Override // android.media.MediaDataSource
                    public long getSize() throws IOException {
                        return -1L;
                    }

                    @Override // android.media.MediaDataSource
                    public int readAt(long j2, byte[] bArr, int i2, int i3) throws IOException {
                        if (i3 == 0) {
                            return 0;
                        }
                        if (j2 < 0) {
                            return -1;
                        }
                        try {
                            long j3 = this.f4178b;
                            if (j3 != j2) {
                                if (j3 >= 0 && j2 >= j3 + seekableByteOrderedDataInputStream.available()) {
                                    return -1;
                                }
                                seekableByteOrderedDataInputStream.m2928c(j2);
                                this.f4178b = j2;
                            }
                            if (i3 > seekableByteOrderedDataInputStream.available()) {
                                i3 = seekableByteOrderedDataInputStream.available();
                            }
                            int read = seekableByteOrderedDataInputStream.read(bArr, i2, i3);
                            if (read >= 0) {
                                this.f4178b += read;
                                return read;
                            }
                        } catch (IOException unused) {
                        }
                        this.f4178b = -1L;
                        return -1;
                    }
                });
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                String str3 = null;
                if ("yes".equals(extractMetadata3)) {
                    str3 = mediaMetadataRetriever.extractMetadata(29);
                    str = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str3 = mediaMetadataRetriever.extractMetadata(18);
                    str = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                }
                if (str3 != null) {
                    this.f4170e[0].put("ImageWidth", ExifAttribute.m2923d(Integer.parseInt(str3), this.f4172g));
                }
                if (str != null) {
                    this.f4170e[0].put("ImageLength", ExifAttribute.m2923d(Integer.parseInt(str), this.f4172g));
                }
                if (str2 != null) {
                    int i2 = 1;
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt == 90) {
                        i2 = 6;
                    } else if (parseInt == 180) {
                        i2 = 3;
                    } else if (parseInt == 270) {
                        i2 = 8;
                    }
                    this.f4170e[0].put("Orientation", ExifAttribute.m2923d(i2, this.f4172g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    seekableByteOrderedDataInputStream.m2928c(parseInt2);
                    byte[] bArr = new byte[6];
                    seekableByteOrderedDataInputStream.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f4150P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    seekableByteOrderedDataInputStream.readFully(bArr2);
                    this.f4174i = i3;
                    m2911t(bArr2, 0);
                }
                if (f4152m) {
                    Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
    
        r19.f4182d = r18.f4172g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0181, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae A[FALL_THROUGH] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2897f(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m2897f(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x00d1, code lost:
    
        if (r8 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014a  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m2898g(java.io.BufferedInputStream r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m2898g(java.io.BufferedInputStream):int");
    }

    /* renamed from: h */
    public final void m2899h(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        m2902k(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = this.f4170e[1].get("MakerNote");
        if (exifAttribute != null) {
            SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.f4188d);
            seekableByteOrderedDataInputStream2.f4182d = this.f4172g;
            byte[] bArr = f4161v;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            seekableByteOrderedDataInputStream2.f4181c += length;
            seekableByteOrderedDataInputStream2.f4180b.readFully(bArr2);
            seekableByteOrderedDataInputStream2.m2928c(0L);
            byte[] bArr3 = f4162w;
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            seekableByteOrderedDataInputStream2.f4181c += length2;
            seekableByteOrderedDataInputStream2.f4180b.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                seekableByteOrderedDataInputStream2.m2928c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                seekableByteOrderedDataInputStream2.m2928c(12L);
            }
            m2912u(seekableByteOrderedDataInputStream2, 6);
            ExifAttribute exifAttribute2 = this.f4170e[7].get("PreviewImageStart");
            ExifAttribute exifAttribute3 = this.f4170e[7].get("PreviewImageLength");
            if (exifAttribute2 != null && exifAttribute3 != null) {
                this.f4170e[5].put("JPEGInterchangeFormat", exifAttribute2);
                this.f4170e[5].put("JPEGInterchangeFormatLength", exifAttribute3);
            }
            ExifAttribute exifAttribute4 = this.f4170e[8].get("AspectFrame");
            if (exifAttribute4 != null) {
                int[] iArr = (int[]) exifAttribute4.m2927h(this.f4172g);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder m24u = C0000a.m24u("Invalid aspect frame values. frame=");
                    m24u.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", m24u.toString());
                } else {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i2 = (iArr[2] - iArr[0]) + 1;
                    int i3 = (iArr[3] - iArr[1]) + 1;
                    if (i2 < i3) {
                        int i4 = i2 + i3;
                        i3 = i4 - i3;
                        i2 = i4 - i3;
                    }
                    ExifAttribute m2923d = ExifAttribute.m2923d(i2, this.f4172g);
                    ExifAttribute m2923d2 = ExifAttribute.m2923d(i3, this.f4172g);
                    this.f4170e[0].put("ImageWidth", m2923d);
                    this.f4170e[0].put("ImageLength", m2923d2);
                }
            }
        }
    }

    /* renamed from: i */
    public final void m2900i(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        if (f4152m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f4182d = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f4163x;
        byteOrderedDataInputStream.m2919b(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = byteOrderedDataInputStream.readInt();
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int i2 = length + 4 + 4;
                if (i2 == 16 && !Arrays.equals(bArr2, f4165z)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f4135A)) {
                    return;
                }
                if (Arrays.equals(bArr2, f4164y)) {
                    byte[] bArr3 = new byte[readInt];
                    byteOrderedDataInputStream.readFully(bArr3);
                    int readInt2 = byteOrderedDataInputStream.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f4174i = i2;
                        m2911t(bArr3, 0);
                        m2917z();
                        m2914w(new ByteOrderedDataInputStream(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i3 = readInt + 4;
                byteOrderedDataInputStream.m2919b(i3);
                length = i2 + i3;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: j */
    public final void m2901j(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        boolean z = f4152m;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.m2919b(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        byteOrderedDataInputStream.readFully(bArr);
        byteOrderedDataInputStream.readFully(bArr2);
        byteOrderedDataInputStream.readFully(bArr3);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        int i4 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i3];
        byteOrderedDataInputStream.m2919b(i2 - byteOrderedDataInputStream.f4181c);
        byteOrderedDataInputStream.readFully(bArr4);
        m2897f(new ByteOrderedDataInputStream(bArr4), i2, 5);
        byteOrderedDataInputStream.m2919b(i4 - byteOrderedDataInputStream.f4181c);
        byteOrderedDataInputStream.f4182d = ByteOrder.BIG_ENDIAN;
        int readInt = byteOrderedDataInputStream.readInt();
        if (z) {
            C0000a.m0A("numberOfDirectoryEntry: ", readInt, "ExifInterface");
        }
        for (int i5 = 0; i5 < readInt; i5++) {
            int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (readUnsignedShort == f4142H.f4189a) {
                short readShort = byteOrderedDataInputStream.readShort();
                short readShort2 = byteOrderedDataInputStream.readShort();
                ExifAttribute m2923d = ExifAttribute.m2923d(readShort, this.f4172g);
                ExifAttribute m2923d2 = ExifAttribute.m2923d(readShort2, this.f4172g);
                this.f4170e[0].put("ImageLength", m2923d);
                this.f4170e[0].put("ImageWidth", m2923d2);
                if (f4152m) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.m2919b(readUnsignedShort2);
        }
    }

    /* renamed from: k */
    public final void m2902k(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        ExifAttribute exifAttribute;
        m2908q(seekableByteOrderedDataInputStream);
        m2912u(seekableByteOrderedDataInputStream, 0);
        m2916y(seekableByteOrderedDataInputStream, 0);
        m2916y(seekableByteOrderedDataInputStream, 5);
        m2916y(seekableByteOrderedDataInputStream, 4);
        m2917z();
        if (this.f4168c != 8 || (exifAttribute = this.f4170e[1].get("MakerNote")) == null) {
            return;
        }
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream2 = new SeekableByteOrderedDataInputStream(exifAttribute.f4188d);
        seekableByteOrderedDataInputStream2.f4182d = this.f4172g;
        seekableByteOrderedDataInputStream2.m2919b(6);
        m2912u(seekableByteOrderedDataInputStream2, 9);
        ExifAttribute exifAttribute2 = this.f4170e[9].get("ColorSpace");
        if (exifAttribute2 != null) {
            this.f4170e[1].put("ColorSpace", exifAttribute2);
        }
    }

    /* renamed from: l */
    public final void m2903l(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        if (f4152m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + seekableByteOrderedDataInputStream);
        }
        m2902k(seekableByteOrderedDataInputStream);
        ExifAttribute exifAttribute = this.f4170e[0].get("JpgFromRaw");
        if (exifAttribute != null) {
            m2897f(new ByteOrderedDataInputStream(exifAttribute.f4188d), (int) exifAttribute.f4187c, 5);
        }
        ExifAttribute exifAttribute2 = this.f4170e[0].get("ISO");
        ExifAttribute exifAttribute3 = this.f4170e[1].get("PhotographicSensitivity");
        if (exifAttribute2 == null || exifAttribute3 != null) {
            return;
        }
        this.f4170e[1].put("PhotographicSensitivity", exifAttribute2);
    }

    /* renamed from: m */
    public final void m2904m(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream) throws IOException {
        byte[] bArr = f4150P;
        seekableByteOrderedDataInputStream.m2919b(bArr.length);
        byte[] bArr2 = new byte[seekableByteOrderedDataInputStream.available()];
        seekableByteOrderedDataInputStream.readFully(bArr2);
        this.f4174i = bArr.length;
        m2911t(bArr2, 0);
    }

    /* renamed from: n */
    public final void m2905n(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        if (f4152m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + byteOrderedDataInputStream);
        }
        byteOrderedDataInputStream.f4182d = ByteOrder.LITTLE_ENDIAN;
        byteOrderedDataInputStream.m2919b(f4136B.length);
        int readInt = byteOrderedDataInputStream.readInt() + 8;
        byte[] bArr = f4137C;
        byteOrderedDataInputStream.m2919b(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                byteOrderedDataInputStream.readFully(bArr2);
                int readInt2 = byteOrderedDataInputStream.readInt();
                int i2 = length + 4 + 4;
                if (Arrays.equals(f4138D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    byteOrderedDataInputStream.readFully(bArr3);
                    this.f4174i = i2;
                    m2911t(bArr3, 0);
                    m2914w(new ByteOrderedDataInputStream(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i2 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                byteOrderedDataInputStream.m2919b(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: o */
    public final void m2906o(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("JPEGInterchangeFormat");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("JPEGInterchangeFormatLength");
        if (exifAttribute == null || exifAttribute2 == null) {
            return;
        }
        int m2925f = exifAttribute.m2925f(this.f4172g);
        int m2925f2 = exifAttribute2.m2925f(this.f4172g);
        if (this.f4168c == 7) {
            m2925f += this.f4175j;
        }
        if (m2925f > 0 && m2925f2 > 0 && this.f4167b == null && this.f4166a == null) {
            byteOrderedDataInputStream.m2919b(m2925f);
            byteOrderedDataInputStream.readFully(new byte[m2925f2]);
        }
        if (f4152m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m2925f + ", length: " + m2925f2);
        }
    }

    /* renamed from: p */
    public final boolean m2907p(HashMap hashMap) throws IOException {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get("ImageLength");
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.m2925f(this.f4172g) <= 512 && exifAttribute2.m2925f(this.f4172g) <= 512;
    }

    /* renamed from: q */
    public final void m2908q(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        ByteOrder m2910s = m2910s(byteOrderedDataInputStream);
        this.f4172g = m2910s;
        byteOrderedDataInputStream.f4182d = m2910s;
        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i2 = this.f4168c;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            StringBuilder m24u = C0000a.m24u("Invalid start code: ");
            m24u.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(m24u.toString());
        }
        int readInt = byteOrderedDataInputStream.readInt();
        if (readInt < 8) {
            throw new IOException(C0000a.m7d("Invalid first Ifd offset: ", readInt));
        }
        int i3 = readInt - 8;
        if (i3 > 0) {
            byteOrderedDataInputStream.m2919b(i3);
        }
    }

    /* renamed from: r */
    public final void m2909r() {
        for (int i2 = 0; i2 < this.f4170e.length; i2++) {
            StringBuilder m25v = C0000a.m25v("The size of tag group[", i2, "]: ");
            m25v.append(this.f4170e[i2].size());
            Log.d("ExifInterface", m25v.toString());
            for (Map.Entry<String, ExifAttribute> entry : this.f4170e[i2].entrySet()) {
                ExifAttribute value = entry.getValue();
                StringBuilder m24u = C0000a.m24u("tagName: ");
                m24u.append(entry.getKey());
                m24u.append(", tagType: ");
                m24u.append(value.toString());
                m24u.append(", tagValue: '");
                m24u.append(value.m2926g(this.f4172g));
                m24u.append("'");
                Log.d("ExifInterface", m24u.toString());
            }
        }
    }

    /* renamed from: s */
    public final ByteOrder m2910s(ByteOrderedDataInputStream byteOrderedDataInputStream) throws IOException {
        short readShort = byteOrderedDataInputStream.readShort();
        if (readShort == 18761) {
            if (f4152m) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f4152m) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder m24u = C0000a.m24u("Invalid byte order: ");
        m24u.append(Integer.toHexString(readShort));
        throw new IOException(m24u.toString());
    }

    /* renamed from: t */
    public final void m2911t(byte[] bArr, int i2) throws IOException {
        SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream = new SeekableByteOrderedDataInputStream(bArr);
        m2908q(seekableByteOrderedDataInputStream);
        m2912u(seekableByteOrderedDataInputStream, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025e  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2912u(androidx.exifinterface.media.ExifInterface.SeekableByteOrderedDataInputStream r22, int r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m2912u(androidx.exifinterface.media.ExifInterface$SeekableByteOrderedDataInputStream, int):void");
    }

    /* renamed from: v */
    public final void m2913v(int i2, String str, String str2) {
        if (this.f4170e[i2].isEmpty() || this.f4170e[i2].get(str) == null) {
            return;
        }
        HashMap[] hashMapArr = this.f4170e;
        hashMapArr[i2].put(str2, hashMapArr[i2].get(str));
        this.f4170e[i2].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2914w(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.m2914w(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream):void");
    }

    /* renamed from: x */
    public final void m2915x(int i2, int i3) throws IOException {
        if (this.f4170e[i2].isEmpty() || this.f4170e[i3].isEmpty()) {
            if (f4152m) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        ExifAttribute exifAttribute = this.f4170e[i2].get("ImageLength");
        ExifAttribute exifAttribute2 = this.f4170e[i2].get("ImageWidth");
        ExifAttribute exifAttribute3 = this.f4170e[i3].get("ImageLength");
        ExifAttribute exifAttribute4 = this.f4170e[i3].get("ImageWidth");
        if (exifAttribute == null || exifAttribute2 == null) {
            if (f4152m) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (exifAttribute3 == null || exifAttribute4 == null) {
            if (f4152m) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int m2925f = exifAttribute.m2925f(this.f4172g);
        int m2925f2 = exifAttribute2.m2925f(this.f4172g);
        int m2925f3 = exifAttribute3.m2925f(this.f4172g);
        int m2925f4 = exifAttribute4.m2925f(this.f4172g);
        if (m2925f >= m2925f3 || m2925f2 >= m2925f4) {
            return;
        }
        HashMap<String, ExifAttribute>[] hashMapArr = this.f4170e;
        HashMap<String, ExifAttribute> hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    /* renamed from: y */
    public final void m2916y(SeekableByteOrderedDataInputStream seekableByteOrderedDataInputStream, int i2) throws IOException {
        ExifAttribute m2923d;
        ExifAttribute m2923d2;
        ExifAttribute exifAttribute = this.f4170e[i2].get("DefaultCropSize");
        ExifAttribute exifAttribute2 = this.f4170e[i2].get("SensorTopBorder");
        ExifAttribute exifAttribute3 = this.f4170e[i2].get("SensorLeftBorder");
        ExifAttribute exifAttribute4 = this.f4170e[i2].get("SensorBottomBorder");
        ExifAttribute exifAttribute5 = this.f4170e[i2].get("SensorRightBorder");
        if (exifAttribute != null) {
            if (exifAttribute.f4185a == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute.m2927h(this.f4172g);
                if (rationalArr == null || rationalArr.length != 2) {
                    StringBuilder m24u = C0000a.m24u("Invalid crop size values. cropSize=");
                    m24u.append(Arrays.toString(rationalArr));
                    Log.w("ExifInterface", m24u.toString());
                    return;
                }
                m2923d = ExifAttribute.m2922c(rationalArr[0], this.f4172g);
                m2923d2 = ExifAttribute.m2922c(rationalArr[1], this.f4172g);
            } else {
                int[] iArr = (int[]) exifAttribute.m2927h(this.f4172g);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder m24u2 = C0000a.m24u("Invalid crop size values. cropSize=");
                    m24u2.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", m24u2.toString());
                    return;
                }
                m2923d = ExifAttribute.m2923d(iArr[0], this.f4172g);
                m2923d2 = ExifAttribute.m2923d(iArr[1], this.f4172g);
            }
            this.f4170e[i2].put("ImageWidth", m2923d);
            this.f4170e[i2].put("ImageLength", m2923d2);
            return;
        }
        if (exifAttribute2 != null && exifAttribute3 != null && exifAttribute4 != null && exifAttribute5 != null) {
            int m2925f = exifAttribute2.m2925f(this.f4172g);
            int m2925f2 = exifAttribute4.m2925f(this.f4172g);
            int m2925f3 = exifAttribute5.m2925f(this.f4172g);
            int m2925f4 = exifAttribute3.m2925f(this.f4172g);
            if (m2925f2 <= m2925f || m2925f3 <= m2925f4) {
                return;
            }
            ExifAttribute m2923d3 = ExifAttribute.m2923d(m2925f2 - m2925f, this.f4172g);
            ExifAttribute m2923d4 = ExifAttribute.m2923d(m2925f3 - m2925f4, this.f4172g);
            this.f4170e[i2].put("ImageLength", m2923d3);
            this.f4170e[i2].put("ImageWidth", m2923d4);
            return;
        }
        ExifAttribute exifAttribute6 = this.f4170e[i2].get("ImageLength");
        ExifAttribute exifAttribute7 = this.f4170e[i2].get("ImageWidth");
        if (exifAttribute6 == null || exifAttribute7 == null) {
            ExifAttribute exifAttribute8 = this.f4170e[i2].get("JPEGInterchangeFormat");
            ExifAttribute exifAttribute9 = this.f4170e[i2].get("JPEGInterchangeFormatLength");
            if (exifAttribute8 == null || exifAttribute9 == null) {
                return;
            }
            int m2925f5 = exifAttribute8.m2925f(this.f4172g);
            int m2925f6 = exifAttribute8.m2925f(this.f4172g);
            seekableByteOrderedDataInputStream.m2928c(m2925f5);
            byte[] bArr = new byte[m2925f6];
            seekableByteOrderedDataInputStream.readFully(bArr);
            m2897f(new ByteOrderedDataInputStream(bArr), m2925f5, i2);
        }
    }

    /* renamed from: z */
    public final void m2917z() throws IOException {
        m2915x(0, 5);
        m2915x(0, 4);
        m2915x(5, 4);
        ExifAttribute exifAttribute = this.f4170e[1].get("PixelXDimension");
        ExifAttribute exifAttribute2 = this.f4170e[1].get("PixelYDimension");
        if (exifAttribute != null && exifAttribute2 != null) {
            this.f4170e[0].put("ImageWidth", exifAttribute);
            this.f4170e[0].put("ImageLength", exifAttribute2);
        }
        if (this.f4170e[4].isEmpty() && m2907p(this.f4170e[5])) {
            HashMap<String, ExifAttribute>[] hashMapArr = this.f4170e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m2907p(this.f4170e[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m2913v(0, "ThumbnailOrientation", "Orientation");
        m2913v(0, "ThumbnailImageLength", "ImageLength");
        m2913v(0, "ThumbnailImageWidth", "ImageWidth");
        m2913v(5, "ThumbnailOrientation", "Orientation");
        m2913v(5, "ThumbnailImageLength", "ImageLength");
        m2913v(5, "ThumbnailImageWidth", "ImageWidth");
        m2913v(4, "Orientation", "ThumbnailOrientation");
        m2913v(4, "ImageLength", "ThumbnailImageLength");
        m2913v(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {

        /* renamed from: b */
        public final DataInputStream f4180b;

        /* renamed from: c */
        public int f4181c;

        /* renamed from: d */
        public ByteOrder f4182d;

        /* renamed from: e */
        public byte[] f4183e;

        /* renamed from: f */
        public int f4184f;

        public ByteOrderedDataInputStream(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f4184f = bArr.length;
        }

        /* renamed from: a */
        public long m2918a() throws IOException {
            return readInt() & 4294967295L;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f4180b.available();
        }

        /* renamed from: b */
        public void m2919b(int i2) throws IOException {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i2 - i3;
                int skip = (int) this.f4180b.skip(i4);
                if (skip <= 0) {
                    if (this.f4183e == null) {
                        this.f4183e = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];
                    }
                    skip = this.f4180b.read(this.f4183e, 0, Math.min(RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST, i4));
                    if (skip == -1) {
                        throw new EOFException(C0000a.m8e("Reached EOF while skipping ", i2, " bytes."));
                    }
                }
                i3 += skip;
            }
            this.f4181c += i3;
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f4181c++;
            return this.f4180b.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f4181c++;
            return this.f4180b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f4181c++;
            int read = this.f4180b.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f4181c += 2;
            return this.f4180b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            this.f4181c += i3;
            this.f4180b.readFully(bArr, i2, i3);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f4181c += 4;
            int read = this.f4180b.read();
            int read2 = this.f4180b.read();
            int read3 = this.f4180b.read();
            int read4 = this.f4180b.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4182d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            StringBuilder m24u = C0000a.m24u("Invalid byte order: ");
            m24u.append(this.f4182d);
            throw new IOException(m24u.toString());
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f4181c += 8;
            int read = this.f4180b.read();
            int read2 = this.f4180b.read();
            int read3 = this.f4180b.read();
            int read4 = this.f4180b.read();
            int read5 = this.f4180b.read();
            int read6 = this.f4180b.read();
            int read7 = this.f4180b.read();
            int read8 = this.f4180b.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4182d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            StringBuilder m24u = C0000a.m24u("Invalid byte order: ");
            m24u.append(this.f4182d);
            throw new IOException(m24u.toString());
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f4181c += 2;
            int read = this.f4180b.read();
            int read2 = this.f4180b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4182d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            StringBuilder m24u = C0000a.m24u("Invalid byte order: ");
            m24u.append(this.f4182d);
            throw new IOException(m24u.toString());
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f4181c += 2;
            return this.f4180b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f4181c++;
            return this.f4180b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f4181c += 2;
            int read = this.f4180b.read();
            int read2 = this.f4180b.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f4182d;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            StringBuilder m24u = C0000a.m24u("Invalid byte order: ");
            m24u.append(this.f4182d);
            throw new IOException(m24u.toString());
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f4180b = dataInputStream;
            dataInputStream.mark(0);
            this.f4181c = 0;
            this.f4182d = byteOrder;
            this.f4184f = inputStream instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream) inputStream).f4184f : -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            int read = this.f4180b.read(bArr, i2, i3);
            this.f4181c += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f4181c += bArr.length;
            this.f4180b.readFully(bArr);
        }
    }

    public static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        public SeekableByteOrderedDataInputStream(byte[] bArr) throws IOException {
            super(bArr);
            this.f4180b.mark(Integer.MAX_VALUE);
        }

        /* renamed from: c */
        public void m2928c(long j2) throws IOException {
            int i2 = this.f4181c;
            if (i2 > j2) {
                this.f4181c = 0;
                this.f4180b.reset();
            } else {
                j2 -= i2;
            }
            m2919b((int) j2);
        }

        public SeekableByteOrderedDataInputStream(InputStream inputStream) throws IOException {
            super(inputStream, ByteOrder.BIG_ENDIAN);
            if (inputStream.markSupported()) {
                this.f4180b.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class ExifAttribute {

        /* renamed from: a */
        public final int f4185a;

        /* renamed from: b */
        public final int f4186b;

        /* renamed from: c */
        public final long f4187c;

        /* renamed from: d */
        public final byte[] f4188d;

        public ExifAttribute(int i2, int i3, long j2, byte[] bArr) {
            this.f4185a = i2;
            this.f4186b = i3;
            this.f4187c = j2;
            this.f4188d = bArr;
        }

        /* renamed from: a */
        public static ExifAttribute m2920a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(ExifInterface.f4149O);
            return new ExifAttribute(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static ExifAttribute m2921b(long j2, ByteOrder byteOrder) {
            long[] jArr = {j2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f4140F[4] * 1]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                wrap.putInt((int) jArr[i2]);
            }
            return new ExifAttribute(4, 1, wrap.array());
        }

        /* renamed from: c */
        public static ExifAttribute m2922c(Rational rational, ByteOrder byteOrder) {
            Rational[] rationalArr = {rational};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f4140F[5] * 1]);
            wrap.order(byteOrder);
            for (int i2 = 0; i2 < 1; i2++) {
                Rational rational2 = rationalArr[i2];
                wrap.putInt((int) rational2.f4193a);
                wrap.putInt((int) rational2.f4194b);
            }
            return new ExifAttribute(5, 1, wrap.array());
        }

        /* renamed from: d */
        public static ExifAttribute m2923d(int i2, ByteOrder byteOrder) {
            int[] iArr = {i2};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[ExifInterface.f4140F[3] * 1]);
            wrap.order(byteOrder);
            for (int i3 = 0; i3 < 1; i3++) {
                wrap.putShort((short) iArr[i3]);
            }
            return new ExifAttribute(3, 1, wrap.array());
        }

        /* renamed from: e */
        public double m2924e(ByteOrder byteOrder) {
            Object m2927h = m2927h(byteOrder);
            if (m2927h == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (m2927h instanceof String) {
                return Double.parseDouble((String) m2927h);
            }
            if (m2927h instanceof long[]) {
                if (((long[]) m2927h).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m2927h instanceof int[]) {
                if (((int[]) m2927h).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m2927h instanceof double[]) {
                double[] dArr = (double[]) m2927h;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m2927h instanceof Rational[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            Rational[] rationalArr = (Rational[]) m2927h;
            if (rationalArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            Rational rational = rationalArr[0];
            return rational.f4193a / rational.f4194b;
        }

        /* renamed from: f */
        public int m2925f(ByteOrder byteOrder) {
            Object m2927h = m2927h(byteOrder);
            if (m2927h == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (m2927h instanceof String) {
                return Integer.parseInt((String) m2927h);
            }
            if (m2927h instanceof long[]) {
                long[] jArr = (long[]) m2927h;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m2927h instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) m2927h;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: g */
        public String m2926g(ByteOrder byteOrder) {
            Object m2927h = m2927h(byteOrder);
            if (m2927h == null) {
                return null;
            }
            if (m2927h instanceof String) {
                return (String) m2927h;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (m2927h instanceof long[]) {
                long[] jArr = (long[]) m2927h;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (m2927h instanceof int[]) {
                int[] iArr = (int[]) m2927h;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (m2927h instanceof double[]) {
                double[] dArr = (double[]) m2927h;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(m2927h instanceof Rational[])) {
                return null;
            }
            Rational[] rationalArr = (Rational[]) m2927h;
            while (i2 < rationalArr.length) {
                sb.append(rationalArr[i2].f4193a);
                sb.append(JsonPointer.SEPARATOR);
                sb.append(rationalArr[i2].f4194b);
                i2++;
                if (i2 != rationalArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:169:0x019b */
        /* JADX WARN: Removed duplicated region for block: B:172:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object m2927h(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.ExifAttribute.m2927h(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("(");
            m24u.append(ExifInterface.f4139E[this.f4185a]);
            m24u.append(", data length:");
            return C0000a.m18o(m24u, this.f4188d.length, ")");
        }

        public ExifAttribute(int i2, int i3, byte[] bArr) {
            this.f4185a = i2;
            this.f4186b = i3;
            this.f4187c = -1L;
            this.f4188d = bArr;
        }
    }

    public static class ExifTag {

        /* renamed from: a */
        public final int f4189a;

        /* renamed from: b */
        public final String f4190b;

        /* renamed from: c */
        public final int f4191c;

        /* renamed from: d */
        public final int f4192d;

        public ExifTag(String str, int i2, int i3) {
            this.f4190b = str;
            this.f4189a = i2;
            this.f4191c = i3;
            this.f4192d = -1;
        }

        public ExifTag(String str, int i2, int i3, int i4) {
            this.f4190b = str;
            this.f4189a = i2;
            this.f4191c = i3;
            this.f4192d = i4;
        }
    }
}
