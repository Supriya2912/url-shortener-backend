package com.supriya.urlshortener;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    // POST - Shorten a URL
    @PostMapping("/shorten")
    public ResponseEntity<Url> shortenUrl(@RequestBody UrlRequest request) {
        Url url = urlService.shortenUrl(request.getOriginalUrl());
        return ResponseEntity.ok(url);
    }

    // GET - Redirect to original URL
    @GetMapping("/{shortCode}")
    public ResponseEntity<String> getOriginalUrl(@PathVariable String shortCode) {
        Optional<Url> url = urlService.getOriginalUrl(shortCode);
        if (url.isPresent()) {
            return ResponseEntity.ok("Original URL: " + url.get().getOriginalUrl());
        }
        return ResponseEntity.notFound().build();
    }
}