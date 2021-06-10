package com.witechtechnology.qrcodeapps.data.response

data class TalentResponse(
    var message: String,
    val success: Boolean = false,
    val meta: Meta,
    val data: Data
) {
    data class Data(
        val accountFacebook: String,
        val accountInstagram: String,
        val accountTiktok: Any,
        val accountTwitter: Any,
        val accountYoutube: Any,
        val address: Any,
        val barcode: String,
        val basicIdea: String,
        val birthday: String,
        val category: Category,
        val categoryId: Int,
        val cityId: Int,
        val createdAt: String,
        val descriptionForTalent: Any,
        val descriptionIdea: String,
        val email: String,
        val id: Int,
        val image: Image,
        val kota: Kota,
        val linkCertificate: LinkCertificate,
        val name: String,
        val noKtp: Any,
        val phoneNumber: String,
        val qrSended: Int,
        val recomendedPhoneNumber: String,
        val sourcheInfo: List<SourcheInfo>,
        val status: Status,
        val statusId: Int,
        val uuid: String
    ) {
        data class Category(
            val id: Int,
            val name: String,
            val uuid: String
        )

        data class Image(
            var raw: String,
            val url: String
        )

        data class Kota(
            val id: Int,
            val name: String,
            val uuid: String
        )

        data class LinkCertificate(
            val raw: String,
            val url: String
        )

        data class SourcheInfo(
            val id: Int,
            val name: String
        )

        data class Status(
            val id: Int,
            val name: String,
            val uuid: String
        )
    }

    data class Meta(
        val message: String,
        val success: Boolean
    )
}
