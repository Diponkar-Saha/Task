
package com.diponnkar.task.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Medium {

    @SerializedName("collection_name")
    private String mCollectionName;
    @SerializedName("conversions_disk")
    private String mConversionsDisk;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("custom_properties")
    private List<Object> mCustomProperties;
    @SerializedName("disk")
    private String mDisk;
    @SerializedName("file_name")
    private String mFileName;
    @SerializedName("generated_conversions")
    private List<Object> mGeneratedConversions;
    @SerializedName("id")
    private Long mId;
    @SerializedName("manipulations")
    private List<Object> mManipulations;
    @SerializedName("mime_type")
    private String mMimeType;
    @SerializedName("model_id")
    private String mModelId;
    @SerializedName("model_type")
    private String mModelType;
    @SerializedName("name")
    private String mName;
    @SerializedName("order_column")
    private String mOrderColumn;
    @SerializedName("original_url")
    private String mOriginalUrl;
    @SerializedName("preview_url")
    private String mPreviewUrl;
    @SerializedName("responsive_images")
    private List<Object> mResponsiveImages;
    @SerializedName("size")
    private String mSize;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("uuid")
    private String mUuid;

    public String getCollectionName() {
        return mCollectionName;
    }

    public void setCollectionName(String collectionName) {
        mCollectionName = collectionName;
    }

    public String getConversionsDisk() {
        return mConversionsDisk;
    }

    public void setConversionsDisk(String conversionsDisk) {
        mConversionsDisk = conversionsDisk;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public List<Object> getCustomProperties() {
        return mCustomProperties;
    }

    public void setCustomProperties(List<Object> customProperties) {
        mCustomProperties = customProperties;
    }

    public String getDisk() {
        return mDisk;
    }

    public void setDisk(String disk) {
        mDisk = disk;
    }

    public String getFileName() {
        return mFileName;
    }

    public void setFileName(String fileName) {
        mFileName = fileName;
    }

    public List<Object> getGeneratedConversions() {
        return mGeneratedConversions;
    }

    public void setGeneratedConversions(List<Object> generatedConversions) {
        mGeneratedConversions = generatedConversions;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public List<Object> getManipulations() {
        return mManipulations;
    }

    public void setManipulations(List<Object> manipulations) {
        mManipulations = manipulations;
    }

    public String getMimeType() {
        return mMimeType;
    }

    public void setMimeType(String mimeType) {
        mMimeType = mimeType;
    }

    public String getModelId() {
        return mModelId;
    }

    public void setModelId(String modelId) {
        mModelId = modelId;
    }

    public String getModelType() {
        return mModelType;
    }

    public void setModelType(String modelType) {
        mModelType = modelType;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getOrderColumn() {
        return mOrderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        mOrderColumn = orderColumn;
    }

    public String getOriginalUrl() {
        return mOriginalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        mOriginalUrl = originalUrl;
    }

    public String getPreviewUrl() {
        return mPreviewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        mPreviewUrl = previewUrl;
    }

    public List<Object> getResponsiveImages() {
        return mResponsiveImages;
    }

    public void setResponsiveImages(List<Object> responsiveImages) {
        mResponsiveImages = responsiveImages;
    }

    public String getSize() {
        return mSize;
    }

    public void setSize(String size) {
        mSize = size;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public String getUuid() {
        return mUuid;
    }

    public void setUuid(String uuid) {
        mUuid = uuid;
    }

}
