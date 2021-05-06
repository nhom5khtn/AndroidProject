package com.example.android.firstweekchallenge.data


class DataRestaurant () {
    companion object{
        var listResStoredHeart: MutableList<Restaurant> = mutableListOf()
        fun storeData(restaurant: Restaurant){
            listResStoredHeart.add(restaurant)
        }
        fun removeData(name: String){
            listResStoredHeart.forEach{
                if(it.name == name) {
                    listResStoredHeart.remove(it)
                }
            }
        }
        fun queryData(): List<Restaurant>{
            return listResStoredHeart.toList()
        }
    }

}
fun getData() :List<Restaurant> {
    return listOf(
        Restaurant("Du Miên Garden Cafe - Phan Văn Trị",
            "7 Phan Văn Trị, P. 10, Quận Gò Vấp, TP.HCM",
            "https://images.foody.vn/res/g4/33760/prof/s640x400/foody-mobile-du-mien-garden-mb-jp-309-635785114907746480.jpg"),
        Restaurant("Country House Cafe",
            "18C Phan Văn Trị, P. 10, District, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g1/978/prof/s180x180/foody-mobile-countryhouse-jpg-246-635683259648435945.jpg"),
        Restaurant("Hẻm Spaghetti - Nguyễn Oanh",
            "212/22 Nguyễn Oanh, P. 17, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g9/82801/prof/s640x400/foody-upload-api-foody-mobile-gi4-jpg-181001160804.jpg"),
        Restaurant("Lava Coffee - Quang Trung",
            "61 Quang Trung, P. 10, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g15/149154/prof/s640x400/foody-upload-api-foody-mobile-4-190111100956.jpg"),
        Restaurant("Mì Cay Naga - 224 Phạm Văn Đồng",
            "224 Phạm Văn Đồng, P.1, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g20/194867/prof/s640x400/foody-mobile-9zbk996o-jpg-112-636143635496125338.jpg"),
        Restaurant("City House Cafe - Sân Vườn Lãng Mạn",
            "21 Huỳnh Khương An, P. 5, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g3/25656/prof/s640x400/foody-mobile-city-house-jpg-354-636133373358973749.jpg"),
        Restaurant("Nhi Nhi Quán - Đặc Sản Phan Rang",
            "125/48 Lê Đức Thọ, P. 17, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g7/66844/prof/s640x400/foody-mobile-bpzy3ni3-jpg-841-636143721820688231.jpg"),
        Restaurant("Yuri Yuri - Ẩm Thực Hàn Quốc",
            "358 Nguyễn Văn Nghi, P. 7, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g4/33645/prof/s640x400/foody-mobile-bayef6n3-jpg-308-636023635570133301.jpg"),
        Restaurant("Trà Sữa Gong Cha - 貢茶 - Phan Văn Trị",
            "595 Phan Văn Trị, P. 5, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g26/252442/prof/s640x400/foody-mobile-12-jpg-323-636148043123028599.jpg"),
        Restaurant("Oasis Cafe",
            "26/14 Phạm Văn Đồng, P. 3, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g2/12513/prof/s640x400/foody-mobile-oasis-cafe-tp-hcm.jpg"),
        Restaurant("Buzza Pizza - Emart Gò Vấp",
            "Tầng Trệt Emart Gò Vấp - 366 Phan Văn Trị, P. 5, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g20/199622/prof/s640x400/201652411519-mobile-foody-logo-2-640x400.jpg"),
        Restaurant("Dallas Cakes & Coffee - Quang Trung",
            "6 Quang Trung, P. 10, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g66/651063/prof/s640x400/foody-mobile-11090821_80492442289-251-636277684533992519.jpg"),
        Restaurant("Hot & Cold - Trà Sữa & Xiên Que - Quang Trung",
            "804 Quang Trung, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g7/60915/prof/s640x400/foody-upload-api-foody-mobile-1-190605180036.jpg"),
        Restaurant("Papaxốt - Quang Trung",
            "458 Quang Trung, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g12/112585/prof/s640x400/foody-upload-api-foody-mobile-7-190109171633.jpg"),
        Restaurant("SaiGon Chic Cafe",
            "82 Đường Số 27, P. 6, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g10/91979/prof/s640x400/foody-mobile-kjuxujry-jpg-982-635838930416211667.jpg"),
        Restaurant("Pizza Hut - Quang Trung",
            "283 Quang Trung, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g3/28883/prof/s640x400/foody-mobile-p-jpg-800-635757703358128351.jpg"),
        Restaurant("Bánh Mì Chảo & Món Ngon Hoa Việt - Quán Cô 3 Hậu",
            "36 Đường Số 18, P. 8, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g13/129725/prof/s640x400/foody-mobile-foody-quan-co-3-hau--960-635652896252263911.jpg"),
        Restaurant("Kichi Kichi Lẩu Băng Chuyền - Quang Trung",
            "1 Quang Trung, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g5/46668/prof/s640x400/foody-mobile-rfokfbsk-jpg-859-635796372049634356.jpg"),
        Restaurant("The Coffee House - Quang Trung",
            "293 Quang Trung, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g16/158187/prof/s640x400/foody-mobile-coffeehousequangtrun-822-635754530645782536.jpg"),
        Restaurant("Cánh Đồng Quán - Lẩu Nướng Tại Bàn - Dương Quảng Hàm",
            "310/14 Dương Quảng Hàm, P. 5, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g4/30102/prof/s640x400/foody-mobile-shwadjuj-jpg-413-636204369735412311.jpg"),
        Restaurant("Chú Tèo Buffet Nướng 99K - K26 Dương Quảng Hàm",
            "N01 Chung Cư K26 Dương Quảng Hàm, P. 7, Quận Gò Vấp, City TP. HCM",
            "https://images.foody.vn/res/g9/83857/prof/s640x400/201722393753-avatar1.jpg"),
    )

}