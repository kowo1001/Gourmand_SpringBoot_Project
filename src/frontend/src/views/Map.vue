<template>
  <div>
    <div id="map" :style="{height}"></div>
  </div>
</template>

<script>
export default {
    name: "myMap",
    props: {
        height: {
            type: String,
            default: "300px",
        },
        Xaxis: {
            type: Number,
        },
        Yaxis: {
            type: Number,
        }
    },
    mounted() {
        if (window.kakao && window.kakao.maps) {
            this.initMap();
        } else {
            const script = document.createElement('script');
            /* global kakao */
            script.onload = () => kakao.maps.load(this.initMap);
            script.src = 'http://dapi.kakao.com/v2/maps/sdk.js?autoload=false&appkey=aa6560bf9f998a736759b50daa25dfa5';
            document.head.appendChild(script);
        }
    },
    methods: {
        initMap() {
            var container = document.getElementById('map');
            var options = {
              center: new kakao.maps.LatLng(this.$props.Xaxis, this.$props.Yaxis),
              level: 3
            };
            var map = new kakao.maps.Map(container, options);
            map.setMapTypeId(kakao.maps.MapTypeId.HYBRID);
        }
    }
}
</script>